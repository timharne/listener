package com.example.listener.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/listener")
public class RestFullController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homePage(HttpServletResponse response)  {
		String message = "Service Status: Live";
		return message;
	}

}

