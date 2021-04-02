package com.cg.hbm.dao;

import com.cg.hbm.entities.Admin;

public interface IAdminRepository  {
	public Admin signIn(Admin admin);
	public Admin signOut(Admin admin);
	
}