package io.github.aaejo.manualintervention.messaging.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import io.github.aaejo.manualintervention.messaging.producer.ReviewersDataProducer;
import io.github.aaejo.messaging.records.Reviewer;

/**
 * CompletedScrapeController
 */
@Controller
public class CompletedScrapeController {
    
    private final ReviewersDataProducer reviewersDataProducer;

    public CompletedScrapeController(ReviewersDataProducer reviewersDataProducer) {
        this.reviewersDataProducer = reviewersDataProducer;
    }

	@MessageMapping("/complete")
	public void handle(Reviewer reviewer) {
		
	}
}