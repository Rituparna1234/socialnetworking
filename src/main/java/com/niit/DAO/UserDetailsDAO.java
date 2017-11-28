package com.niit.DAO;

import java.util.List;

import com.niit.Model.UserDetails;


public interface UserDetailsDAO {
	
	public boolean addUserDetail(UserDetails user);
	public boolean updateOnlineStatus(String status, User user);
	public List<User> getAllUserDetails();
	public User getUserDetails(String username);
	

}
