package eu.crystal.spring_tutorial_1.domain.greeting;

import eu.crystal.spring_tutorial_1.Greeting;
import eu.crystal.spring_tutorial_1.domain.GreetingService;

import java.util.concurrent.atomic.AtomicLong;

public class SimpleGreetingService implements GreetingService{
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Override
    public Greeting getGreeting(String s) {
        return new Greeting(counter.incrementAndGet(), String.format(template, s));
    }
}
