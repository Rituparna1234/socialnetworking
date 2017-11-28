package com.niit.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Model.UserDetails;


@Repository("UserDAO")
public class UserDetailsDAOImpl implements UserDetailsDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	UserDetails	DAO userDAO;
	
	public UserDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}


		
	@Transactional
	public boolean updateOnlineStatus(String status, User user) {
		try
		{
			user.setIsOnline(status);
		sessionFactory.getCurrentSession().save(user);
		return true;
		}
		catch(Exception e)
		{
		System.out.println("Exception occured:" +e);
		return false;
		}	
	}


	
	@Transactional
	
	public boolean addUserDetail(User user) {
		try
		{
		sessionFactory.getCurrentSession().save(user);
		return true;
		}
		catch(Exception e)
		{
		System.out.println("Exception occured:" +e);
		return false;
		}	
	}



	@Transactional
	public List<User> getAllUserDetails() {
		Session session=sessionFactory.openSession();
		 List<User> user=(List<User>)session.createQuery("from User").list();
			session.close();
			return user;
	}

@Transactional
	public User getUserDetails(String username) {
		Session session=sessionFactory.openSession();
		User user=(User)session.get(User.class,username);
		session.close();
		return user;
	}



public boolean addUserDetail(UserDetails user) {
	// TODO Auto-generated method stub
	return false;
}



public User getUserDetails(String username) {
	// TODO Auto-generated method stub
	return null;
}



public User getUserDetails(String username) {
	// TODO Auto-generated method stub
	return null;
}

	


}
