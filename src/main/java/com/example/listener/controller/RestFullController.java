package com.example.listener.controller;

import com.example.listener.model.Watchlist;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/listener")
public class RestFullController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homePage(HttpServletResponse response)  {
		String message = "Service Status: Live!";
		return message;
	}

	@PostMapping("/watchlist")
	public String postWatchlist(@RequestBody Watchlist watchlist){
		System.out.println(watchlist);
		return "Done";
	}

}

