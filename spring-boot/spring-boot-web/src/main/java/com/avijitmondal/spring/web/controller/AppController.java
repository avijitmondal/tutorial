package com.avijitmondal.spring.web.controller;

import com.avijitmondal.spring.web.util.MyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String getHello() throws MyException {
        int x = 3;
        if (x > 2)
            throw new MyException("x");
        return "Hello World";
    }
}
