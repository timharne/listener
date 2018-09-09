package com.example.listener.controller;

import com.example.listener.model.Watchlist;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/listener")
public class XmlRestController {

    @Value("${spring.file}")
    private String jsonFile;

    @GetMapping("/status")
	public String homePage(HttpServletResponse response)  {
		String message = "Service Status: Live!";
		return message;
	}

	@PostMapping("/watchlist")
	public String postWatchlist(HttpServletRequest request, @RequestBody Watchlist watchlist) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.writeValue(new File(jsonFile), watchlist );
        return "Done";
	}

}

