package com.cg.hbm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hbm.entities.User;

@Repository
public interface IUserRepository extends JpaRepository<User,Integer>{
	
	/*
	
	public User saveUser(User user);
	public User editUser(User user);
	public User deleteUser(Integer user_id);
	public List<User> fetchAllUsers();
	public User viewUser(Integer user_id);
	
	
	*/
	
	
}