package io.github.avijitmondal.function.controller;

import java.util.function.Function;

public class CustomController implements Function<String, String> {
    @Override
    public String apply(String username) {
        return username.toUpperCase();
    }
}
