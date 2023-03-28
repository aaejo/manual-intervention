package io.github.aaejo.manualintervention.messaging.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import io.github.aaejo.manualintervention.messaging.producer.ReviewersDataProducer;
import io.github.aaejo.messaging.records.Reviewer;
import lombok.extern.slf4j.Slf4j;

/**
 * CompletedScrapeController
 */


@Controller
@Slf4j
public class CompletedScrapeController {
    
    private final ReviewersDataProducer reviewersDataProducer;

    public CompletedScrapeController(ReviewersDataProducer reviewersDataProducer) {
        this.reviewersDataProducer = reviewersDataProducer;
    }

	@MessageMapping("/complete")
	public void handle(Reviewer reviewer) {
        log.debug("Sending reviewer object to reviewers-data kafka topic");
		reviewersDataProducer.send(reviewer);
	}
}