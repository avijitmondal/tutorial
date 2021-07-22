package io.github.avijitmondal.function.controller;

import io.github.avijitmondal.function.model.User;

import java.util.function.Function;

public class CustomInputController implements Function<User, User> {
    @Override
    public User apply(User user) {
        user.setUsername(user.getUsername().toUpperCase());
        return user;
    }
}
