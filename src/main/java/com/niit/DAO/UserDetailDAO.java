package com.niit.DAO;

import java.util.List;

import com.niit.Model.UserDetail;



public interface UserDetailDAO {

public boolean addUser(UserDetail user);
	
	public boolean updateUser(UserDetail user);
	
	public boolean deleteUser(UserDetail user);
	
	public UserDetail getUser(int userId);
	
	public List<UserDetail> getAllusers();
	
	public boolean approveUser(UserDetail user);
	
	public boolean rejectUser(UserDetail user);
	
}
