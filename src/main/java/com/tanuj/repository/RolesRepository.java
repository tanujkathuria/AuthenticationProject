package com.tanuj.repository;

import org.springframework.data.repository.CrudRepository;

import com.tanuj.model.Roles;

public interface RolesRepository extends CrudRepository<Roles, Integer>{

	Roles findByRoleId(int roleId);
}
