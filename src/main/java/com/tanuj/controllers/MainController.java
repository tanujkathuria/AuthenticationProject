package com.tanuj.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tanuj.service.LoginService;
import com.tanuj.service.RolesService;
import com.tanuj.dto.LoginDTO;
import com.tanuj.dto.RolesDTO;

@CrossOrigin
@SuppressWarnings("unchecked")
@RestController
@RequestMapping
public class MainController {
	
	private final static Logger LOGGER = Logger.getLogger(MainController.class.getName());
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private RolesService rolesService;

	@GetMapping("/login")
	public LoginDTO loginApp(@RequestParam("user") String userName, @RequestParam("pass") String password ){
		return loginService.getLoginDetails(userName);
	}
	
	@GetMapping("/getRoles/{id}")
	public Map<Integer, RolesDTO> getRoles(@PathVariable int id)  {
		Map<Integer, RolesDTO> map = new  HashMap<Integer, RolesDTO>();
		map.put(id,rolesService.getRoles(id));
		return map ;
	}
}
