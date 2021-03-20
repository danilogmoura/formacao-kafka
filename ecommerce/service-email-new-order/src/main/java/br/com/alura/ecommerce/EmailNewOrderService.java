package br.com.alura.ecommerce;

import br.com.alura.ecommerce.consumer.ConsumerService;
import br.com.alura.ecommerce.consumer.ServiceRunner;
import br.com.alura.ecommerce.dispatcher.KafkaDispatcher;
import org.apache.kafka.clients.consumer.ConsumerRecord;

import java.util.concurrent.ExecutionException;

public class EmailNewOrderService implements ConsumerService<Order> {

    private final KafkaDispatcher<String> emailDispatcher = new KafkaDispatcher<>();

    public static void main(String[] args) {
        new ServiceRunner<>(EmailNewOrderService::new).start(1);
    }

    @Override
    public void parse(ConsumerRecord<String, Message<Order>> record) throws ExecutionException, InterruptedException {
        System.out.println("----------------------------------------");
        System.out.println("Processing new order, preparing e-mail");
        var message = record.value();
        System.out.println(message);

        var order = message.getPayload();
        var emailCode = "Thank you for your order! We are processing your order!";
        var id = record.value().getId();

        emailDispatcher.send("ECOMMERCE_SEND_EMAIL",
                order.getEmail(),
                id.continueWith(EmailNewOrderService.class.getSimpleName()),
                emailCode);
    }

    @Override
    public String getTopic() {
        return "ECOMMERCE_NEW_ORDER";
    }

    @Override
    public String getConsumerGroup() {
        return EmailNewOrderService.class.getSimpleName();
    }
}
