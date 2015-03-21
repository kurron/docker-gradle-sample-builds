package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Driver for the application.
 */
@SpringBootApplication
public class Application {

    /**
     * Entry point into the application.
     * @param args any command-line arguments that may have been passed in.
     */
    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
