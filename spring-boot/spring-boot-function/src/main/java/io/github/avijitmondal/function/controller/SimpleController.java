package io.github.avijitmondal.function.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Controller
public class SimpleController {
    @Bean
    public Function<String, String> function() {
        return name -> name;
    }

    @Bean
    public Consumer<String> consume() {
        return name -> System.err.println("Hi - " + name);
    }

    @Bean
    public Supplier<String> supplier() {
        return () -> "Hello world";
    }
}
