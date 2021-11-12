package com.md.springweb;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String greetingTemplate = "Hello, %s!";
    private static final String legendTemplate = "%s is a legend!";
    private final AtomicLong counter = new AtomicLong();
    private final AtomicLong counter2 = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(greetingTemplate, name));
    }

    @GetMapping("/legend")
    public Legend legend(@RequestParam(value = "name", defaultValue = "Shaun Lee") String name){
        return new Legend(counter2.incrementAndGet(), String.format(legendTemplate, name));
    }
}
