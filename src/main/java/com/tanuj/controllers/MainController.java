package com.tanuj.controllers;

import com.tanuj.dto.LoginDTO;
import com.tanuj.dto.RiskDTO;
import com.tanuj.dto.RolesDTO;
import com.tanuj.model.Risk;
import com.tanuj.service.LoginService;
import com.tanuj.service.RisksService;
import com.tanuj.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.logging.Logger;

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

	@Autowired
	private RisksService risksService;

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

	@GetMapping("/getRisk/{id}")
	public Map<String,Optional<Risk>> getRisk(@PathVariable String id)  {
		Map<String, Optional<Risk>> map = new  HashMap<String, Optional<Risk>>();
		map.put(id,risksService.getRisk(id));
		return map ;
	}

	@GetMapping("/riskDetails")
	public List<RiskDTO> getRisks(){
		List<RiskDTO> risksDTOList =new ArrayList<RiskDTO>();
		Iterator<Risk> iterator = risksService.getRisks().iterator();
		while(iterator.hasNext()) {
			Risk risk= iterator.next();
			RiskDTO riskDTO=new RiskDTO(risk);
			risksDTOList.add(riskDTO);
		}
		return risksDTOList;
	}

	@PostMapping("/AddRisk")
	public ResponseEntity<String> addRisk(@RequestBody Risk risk)
	{
		return risksService.addRisk(risk);
	}

	@PostMapping("/DeleteRisk/{id}")
	public ResponseEntity<String> deleteRisk(@PathVariable String id)
	{
		return risksService.deleteRisk(id);
	}

}
