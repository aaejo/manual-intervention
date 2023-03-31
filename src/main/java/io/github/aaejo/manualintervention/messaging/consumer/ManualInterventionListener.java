package io.github.aaejo.manualintervention.messaging.consumer;

import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

import io.github.aaejo.messaging.records.IncompleteScrape;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Omri Harary
 * @author Aidan Richards
 */
@Slf4j
@Component
@KafkaListener(id = "manual-intervention", topics = "manual-intervention")
public class ManualInterventionListener {

    private final SimpMessagingTemplate simpMessagingTemplate;

    public ManualInterventionListener(SimpMessagingTemplate simpMessagingTemplate) {
        this.simpMessagingTemplate = simpMessagingTemplate;
    }

    @KafkaHandler
    public void handle(IncompleteScrape incompleteScrape) {
        log.debug("Received incomplete scrape {}", incompleteScrape);
        simpMessagingTemplate.convertAndSend("/data/incompleteScrape", incompleteScrape);
    }
}
