package io.github.aaejo.manualintervention;

import io.github.aaejo.manualintervention.messaging.test_producer.ManualInterventionTestProducer; //added
import io.github.aaejo.messaging.records.IncompleteScrape;
import io.github.aaejo.messaging.records.Institution;
import io.github.aaejo.messaging.records.Profile;
import io.github.aaejo.messaging.records.Reviewer;

import org.springframework.beans.factory.annotation.Autowired; //added

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ManualInterventionApplication {

    //@Autowired
    //private ManualInterventionTestProducer testProducer;

    //public static void main(String[] args) {
    //    SpringApplication.run(ManualInterventionApplication.class, args);
    //    System.out.println("hello");
    //}

    public static void main(String[] args) {
        SpringApplication.run(ManualInterventionApplication.class, args);   
    }
}
