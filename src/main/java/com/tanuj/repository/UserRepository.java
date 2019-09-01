package com.tanuj.repository;

import org.springframework.data.repository.CrudRepository;

import com.tanuj.model.User;

public interface UserRepository extends CrudRepository<User, Long>
{
	User findByUserEmail(String userEmail);
}
