package com.niit.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Model.UserDetails;


@Repository("UserDetailsDAO")
public class UserDetailsDAOImpl implements UserDetailsDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	UserDetailsDAO user;
	
	public UserDetailsDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}


		
	@Transactional
	public boolean updateOnlineStatus(String status, UserDetails user) {
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
	
	public boolean addUserDetails(UserDetails user) {
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
	public List<UserDetails> getAllUserDetails() {
		Session session=sessionFactory.openSession();
		 List<UserDetails> user=(List<UserDetails>)session.createQuery("from User").list();
			session.close();
			return user;
	}

@Transactional
	public UserDetails getUserDetails(String username) {
		Session session=sessionFactory.openSession();
		UserDetails user=(UserDetails)session.get(UserDetails.class,username);
		session.close();
		return user;
	}



public boolean addUserDetail(UserDetails user) {
	// TODO Auto-generated method stub
	return false;
}
}

