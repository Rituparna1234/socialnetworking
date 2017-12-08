package com.niit.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.Model.UserDetail;


@Repository
public class UserDetailDAOImpl implements UserDetailDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	UserDetailDAO userDAO;
	public UserDetailDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	@Transactional
	public boolean addUser(UserDetail user) {
		try
		{
		sessionFactory.getCurrentSession().save(user);
		return true;
		}
		catch(Exception e)
		{
		System.out.println(e);
		return false;
		}	
	}
@Transactional
	public boolean updateUser(UserDetail user) {
		try
		{
		sessionFactory.getCurrentSession().saveOrUpdate(user);
		return true;
		}
		catch(Exception e)
		{
		System.out.println("Exception occured:"+e);
		return false;
		}	
	}
@Transactional
	public boolean deleteUser(UserDetail user)
	{
		try
		{
		sessionFactory.getCurrentSession().delete(user);
		return true;
		}
		catch(Exception e)
		{
		System.out.println("Exception occured:"+e);
		return false;
		}	
	}
@Transactional
	public UserDetail getUser(int userId) {
		Session session=sessionFactory.openSession();
		UserDetail user=(UserDetail)session.get(UserDetail.class, userId);
		session.close();
		return user;
	}
@Transactional
	public List<UserDetail> getAllusers() {
Session session=sessionFactory.openSession();
		
		List<UserDetail> userList=(List<UserDetail>)session.createQuery("from User").list();
		session.close();
		return userList;
	}
@Transactional
	public boolean approveUser(UserDetail user) {
		{
			try{
				user.setStatus("A");
				sessionFactory.getCurrentSession().saveOrUpdate(user);
				return true;
				}
				catch(Exception e)
				{
				System.out.println("Exception occured:"+e);
				return false;
				}	
			}
	}
@Transactional
	public boolean rejectUser(UserDetail user) {
		try{
			user.setStatus("N");
			sessionFactory.getCurrentSession().update(user);
			return true;
			}
			catch(Exception e)
			{
			System.out.println("Exception occured:"+e);
			return false;
			}	
		
	}

}
