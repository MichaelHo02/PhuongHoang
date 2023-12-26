package com.phuonghoang.orderservice.listeners;

import com.phuonghoang.orderservice.config.KafkaConfigProps;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ProductListener {
    @KafkaListener(topics = "product.created")
    void listen(String in) {
        System.out.println("Receive data: " + in);
    }
}
