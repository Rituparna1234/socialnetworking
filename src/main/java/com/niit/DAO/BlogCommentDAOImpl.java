/*package com.niit.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Model.BlogComment;



@Repository("BlogCommentDAO")
public  class BlogCommentDAOImpl implements BlogCommentDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	
	@Autowired
	BlogCommentDAO blogCommentDAO;
	
	public BlogCommentDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}

	@Transactional
	public boolean saveBlogComment(BlogComment blogComment) {
		try {
			sessionFactory.getCurrentSession().save(blogComment);
			return true;
		} catch (Exception e) {
			System.out.println("exception arised"+e);
		}
		return false;
	}
	@Transactional
	public boolean deleteBlogComment(BlogComment blogComment) {
		try {
			sessionFactory.getCurrentSession().delete(blogComment);
			return true;
		} catch (Exception e) {
			System.out.println("exception arised" +e);
		}
		return false;
	}
	@Transactional
	public boolean updateBlogComment(BlogComment blogComment) {
		try {
			sessionFactory.getCurrentSession().update(blogComment);
			return true;
		} catch (Exception e) {
			System.out.println("exception arised" +e);
		}
		return false;
	}
	@Transactional
	public BlogComment getBlogComment(int blogCommentId) {

		Session session = sessionFactory.openSession();
		BlogComment blogComment = (BlogComment) session.get(BlogComment.class, new Integer(blogCommentId));
		return blogComment;

	}
	@Transactional
	public List<BlogComment> getAllBlogComment() {

		return sessionFactory.getCurrentSession().createQuery("from BlogComment").list();
	}
	

}
*/