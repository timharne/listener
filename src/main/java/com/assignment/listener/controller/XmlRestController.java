package com.assignment.listener.controller;

import com.assignment.listener.model.Watchlist;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * The type Xml rest controller.
 */
@RestController
@RequestMapping("/listener")
public class XmlRestController {

    @Value("${spring.file}")
    private String jsonFile;


    /**
     * Status page string, to check to se if services is running.
     *
     * @param response the response
     * @return the string
     */
    @GetMapping("/status")
	public String statusPage(HttpServletResponse response)  {
		String message = "Service Status: Live!" + "<br/><br/>" + new Date();
		return message;
	}

    /**
     * Post watchlist response entity.
     *
     * @param request   the request
     * @param watchlist the watchlist
     * @return the response entity
     * @throws IOException the io exception
     */
    @PostMapping("/watchlist")
	public ResponseEntity<Watchlist> postWatchlist(HttpServletRequest request, @RequestBody Watchlist watchlist) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.writeValue(new File(jsonFile), watchlist );
        return new ResponseEntity<>(watchlist, HttpStatus.OK);
	}

}

