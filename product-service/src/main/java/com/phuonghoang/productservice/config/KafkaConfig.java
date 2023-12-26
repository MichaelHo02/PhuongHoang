package com.phuonghoang.productservice.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {
    @Bean
    public NewTopic newTopicProduct(final KafkaConfigProps props) {
        return TopicBuilder.name(props.getProductTopic())
                .partitions(10)
                .replicas(1)
                .build();
    }
}
