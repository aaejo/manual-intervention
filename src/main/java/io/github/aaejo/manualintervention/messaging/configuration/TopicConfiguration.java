package io.github.aaejo.manualintervention.messaging.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfiguration {

    @Bean
    public NewTopic manualInterventionTopic() {
        return TopicBuilder
                .name("manual-intervention")
                .build();
    }

    @Bean
    public NewTopic reviewersDataTopic() {
        return TopicBuilder
                .name("reviewers-data")
                .build();
    }
}
