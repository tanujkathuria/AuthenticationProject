package com.tanuj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.tanuj.repository.UserRepository;
import com.tanuj.exceptions.UserNotFoundException;
import com.tanuj.model.User;
import com.tanuj.dto.LoginDTO;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public LoginDTO getLoginDetails(String userEmail) {
		User user = userRepository.findByUserEmail(userEmail);
		LoginDTO loginDTO = null;
		if(!StringUtils.isEmpty(user)) {
			loginDTO =new LoginDTO();
			loginDTO.setEmailId(user.getUserEmail());
			loginDTO.setOrganization(user.getOrganization());
			loginDTO.setRoles(user.getRoles());
			loginDTO.setUserId(user.getUserId());
			return loginDTO;
		}
		throw new UserNotFoundException(userEmail, " user is not found");
	}

}
