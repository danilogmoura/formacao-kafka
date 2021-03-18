package br.com.alura.ecommerce;

import org.apache.kafka.clients.consumer.ConsumerRecord;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public class CreateUserService {

    private final Connection connection;

    public CreateUserService() throws SQLException {
        String url = "jdbc:sqlite:target/user_database.db";
        this.connection = DriverManager.getConnection(url);
        connection.createStatement().execute("CREATE TABLE users (" +
                "uuid varchar(200) primary key, " +
                "email varchar(200))");
    }

    public static void main(String[] args) throws SQLException {
        final var createUserService = new CreateUserService();

        try (var service = new KafkaService<>(CreateUserService.class.getSimpleName(), "ECOMMERCE_NEW_ORDER",
                createUserService::parse,
                Order.class,
                Map.of())) {
            service.run();
        }
    }

    private void parse(ConsumerRecord<String, Order> record) throws SQLException {
        System.out.println("----------------------------------------");
        System.out.println("Processing new order, checking for new user");
        System.out.println(record.value());
        var order = record.value();

        if (isNewUser(order.getEmail())) {
            insertNewUser(order.getEmail());
        }
    }

    private void insertNewUser(String email) throws SQLException {
        final var prepareStatement = connection.prepareStatement("INSERT INTO users (uuid, email) " +
                "VALUES (?,?)");

        prepareStatement.setString(1, "uuid");
        prepareStatement.setString(2, "email");
        prepareStatement.execute();
        System.out.println();

        System.out.println("User uuid and e-mail " + email + " added");
    }

    private boolean isNewUser(String email) throws SQLException {
        final var preparedStatement = connection.prepareStatement("SELECT uuid FROM users " +
                "WHERE email = ? " +
                "LIMIT 1");

        preparedStatement.setString(1, email);

        var resultSet = preparedStatement.executeQuery();

        return resultSet.next();
    }
}
