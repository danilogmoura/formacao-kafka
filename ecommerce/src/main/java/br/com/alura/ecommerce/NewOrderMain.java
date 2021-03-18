package br.com.alura.ecommerce;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

public class NewOrderMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final var producer = new KafkaProducer<String, String>(properties());

        Callback callback = (data, ex) -> {
            if (ex != null) {
                ex.printStackTrace();
                return;
            }
            System.out.println("success " + data.topic() + "::partition " + data.partition() + "/ offset " + data.offset() + "/" + data.timestamp());
        };

        for (int i = 0; i < 100; i++) {
            var key = UUID.randomUUID().toString();
            var value = key + ",67813,13131313";
            var record = new ProducerRecord<String, String>("ECOMMERCE_NEW_ORDER", value, value);

            var email = "Thank you for your order! We are processing your order!";
            var emailRecord = new ProducerRecord<String, String>("ECOMMERCE_SEND_EMAIL", email, email);

            producer.send(record, callback).get();
            producer.send(emailRecord, callback).get();
        }
    }

    private static Properties properties() {
        var properties = new Properties();
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        return properties;
    }
}
