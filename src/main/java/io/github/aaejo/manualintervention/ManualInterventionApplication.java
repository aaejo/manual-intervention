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
        ConfigurableApplicationContext context = SpringApplication.run(ManualInterventionApplication.class, args);

        ManualInterventionTestProducer testProducer = context.getBean(ManualInterventionTestProducer.class);

        // Create test data
        Institution institution = new Institution("Test University", "hi", "bye", "hello");
        Profile profile = new Profile("<html>Test</html>", "https://test.university.edu/profile/1", "Computer Science", institution);
        Reviewer reviewer = new Reviewer("John Doe", "Dr.", "john.doe@test.university.edu", institution, "Computer Science", new String[]{"AI", "ML"});
        IncompleteScrape.MissingFlags[] missingFlags = {IncompleteScrape.MissingFlags.NAME};

        // Create IncompleteScrape object
        IncompleteScrape incompleteScrape = new IncompleteScrape(profile, reviewer, missingFlags);

        // Send test message
        testProducer.send(incompleteScrape);
        testProducer.send(incompleteScrape);
        testProducer.send(incompleteScrape);
        testProducer.send(incompleteScrape);
        testProducer.send(incompleteScrape);
        testProducer.send(incompleteScrape);
        testProducer.send(incompleteScrape);
        testProducer.send(incompleteScrape);
        testProducer.send(incompleteScrape);
        testProducer.send(incompleteScrape);
        testProducer.send(incompleteScrape);
    }

    

}
