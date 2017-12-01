package com.niit.DAO;

import java.util.List;

import com.niit.Model.UserDetails;


public interface UserDetailsDAO {
	
	public boolean addUserDetail(UserDetails user);
	public boolean updateOnlineStatus(String status, UserDetails user);
	public List<UserDetails> getAllUserDetails();
	public UserDetails getUserDetails(String username);
	

}
