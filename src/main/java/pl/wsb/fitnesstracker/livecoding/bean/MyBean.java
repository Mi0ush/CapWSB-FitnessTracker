package pl.wsb.fitnesstracker.livecoding.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * A demonstration bean to illustrate the Spring Bean lifecycle.
 * This bean is active only when the "BeanCycle" profile is enabled.
 */
@Profile("BeanCycle")
@Service
public class MyBean {

    /**
     * Constructs a new MyBean instance.
     * Prints a message to the console to indicate instantiation.
     */
    public MyBean() {
        System.out.println("Instantiation");
    }

    /**
     * Initializes the bean.
     * This method is annotated with {@link PostConstruct} and is executed after dependency injection is complete.
     * Prints a message to the console to indicate initialization.
     */
    @PostConstruct
    public void init() {
        System.out.println("Initializing..");
    }

    /**
     * Performs cleanup before the bean is destroyed.
     * This method is annotated with {@link PreDestroy} and is executed just before the container destroys the bean.
     * Prints a message to the console to indicate destruction.
     */
    @PreDestroy
    public void destroy() {
        System.out.println("Destroying..");
    }
}
