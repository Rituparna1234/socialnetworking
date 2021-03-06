package com.niit.DAO;

import java.util.List;

import com.niit.Model.Friend;



public interface FriendDAO {
public boolean addFriend(Friend friend);
	
	public boolean updateFriend(Friend friend);
	
	public boolean deleteFriend(Friend friend);
	
	public Friend getFriend(int friendId);
	
	public List<Friend> getAllFriends();
	
	public boolean approveFriend(Friend friend);
	
	public boolean rejectFriend(Friend friend);
}
