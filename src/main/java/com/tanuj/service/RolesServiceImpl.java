package com.tanuj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.tanuj.dto.RolesDTO;
import com.tanuj.exceptions.RolesNotFoundException;
import com.tanuj.model.Roles;
import com.tanuj.repository.RolesRepository;

@Service
public class RolesServiceImpl implements RolesService{

	@Autowired
	RolesRepository rolesRepository;
	
	@Override
	public RolesDTO getRoles(int roleId) {
		Roles roles = rolesRepository.findByRoleId(roleId);
		RolesDTO rolesDTO = null;
		if(!StringUtils.isEmpty(roles)) {
			rolesDTO =new RolesDTO();
			rolesDTO.setRoleId(roles.getRoleId());
			rolesDTO.setAddAccess(roles.getAddAccess());
			rolesDTO.setEditAccess(roles.getEditAccess());
			rolesDTO.setDeleteAccess(roles.getDeleteAccess());
			return rolesDTO;
		}
		throw new RolesNotFoundException(roleId, " role is not found");
	}

}
