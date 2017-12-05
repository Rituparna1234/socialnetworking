package com.niit.DAO;

import java.util.List;

import com.niit.Model.UserDetail;




public interface UserDetailDAO {
	
	public boolean addUserDetail(UserDetail user);
	public boolean updateOnlineStatus(String status, UserDetail user);

	public List<UserDetail> getAllUserDetails();
	public UserDetail getUserDetails(String username);
	

}
