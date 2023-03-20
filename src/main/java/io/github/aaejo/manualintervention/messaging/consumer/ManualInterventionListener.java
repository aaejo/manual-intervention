package io.github.aaejo.manualintervention.messaging.consumer;

import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import io.github.aaejo.messaging.records.IncompleteScrape;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@KafkaListener(id = "manual-intervention", topics = "manual-intervention")
public class ManualInterventionListener {

    @KafkaHandler
    public void handle(IncompleteScrape incompleteScrape) {
        System.out.println("kafkaMessage: " + incompleteScrape.toString());
        log.info(incompleteScrape.toString());
        
    }
}


