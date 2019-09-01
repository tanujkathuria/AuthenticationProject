package com.tanuj.controllers;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tanuj.service.LoginService;
import com.tanuj.dto.LoginDTO;

@CrossOrigin
@SuppressWarnings("unchecked")
@RestController
@RequestMapping
public class MainController {
	
	private final static Logger LOGGER = Logger.getLogger(MainController.class.getName());
	
	@Autowired
	private LoginService loginService;

	@GetMapping("/login")
	public LoginDTO loginApp(@RequestParam("user") String userName, @RequestParam("pass") String password ){
		return loginService.getLoginDetails(userName);
	}
}
