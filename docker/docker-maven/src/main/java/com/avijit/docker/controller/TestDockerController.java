package com.avijit.docker.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TestDockerController {

	@RequestMapping(path = "/api/hello", method = RequestMethod.GET)
	public String hello() {
		return "Hello Avijit";
	}
}
