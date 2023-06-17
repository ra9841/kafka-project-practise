package com.kafkaConsumer1.practiseConsumer1.consumerService;

import com.kafkaDto.practiseDto.userDto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumeMessage {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConsumeMessage.class);

    @KafkaListener(
            topics = "${spring.kafka.topic.name}"
            ,groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consume(OrderEvent event){
        LOGGER.info(String.format("Message received from producer to consumer => %s", event.toString()));

        // save the order event into the database
    }
}
