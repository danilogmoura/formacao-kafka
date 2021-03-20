package br.com.alura.ecommerce;

import br.com.alura.ecommerce.database.LocalDatabase;

import java.io.Closeable;
import java.sql.SQLException;

public class OrdersDatabase implements Closeable {

    private final LocalDatabase database;

    public OrdersDatabase() throws SQLException {
        this.database = new LocalDatabase("orders_database");
        // you might want to save all data
        this.database.createIfNotExists("create table Orders ( " +
                "uuid varchar(200) primary key)");
    }

    public boolean saveNew(Order order) throws SQLException {
        if (wasProcessed(order)) {
            return false;
        }
        var statement = "insert into Orders (uuid) values (?)";
        database.update(statement, order.getUserId());
        return true;
    }

    private boolean wasProcessed(Order order) throws SQLException {
        var query = "select uuid from Orders where uuid = ? limit 1";
        var result = database.query(query, order.getUserId());
        return result.next();
    }

    @Override
    public void close() {
        try {
            database.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
