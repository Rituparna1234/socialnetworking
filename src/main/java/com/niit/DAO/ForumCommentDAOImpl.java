/*package com.niit.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.niit.Model.ForumComment;

@Repository("forumCommentDAO")
public class ForumCommentDAOImpl implements ForumCommentDAO {
	
	
	private static final String ForumComment = null;
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	ForumCommentDAO forumCommentDAO;
	public ForumCommentDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public boolean saveForumComment(ForumComment forumComment) {
		
			try {
				sessionFactory.getCurrentSession().save(forumComment);
				return true;
			} catch (Exception e) {
				System.out.println("exception arised" + e);
				return false;
			}
			
		}
	@Transactional
	public boolean deleteForumComment(ForumComment forumComment) {
		try {
			sessionFactory.getCurrentSession().delete(forumComment);
			return true;
		} catch (Exception e) {
			System.out.println("exception arised" + e);
			return false;
		}
		
	}
	@Transactional
	public boolean updateForumComment(ForumComment forumComment) {
		try{
			sessionFactory.getCurrentSession().update(forumComment);
			return true;
		}catch(Exception e){
			System.out.println("exception arised" +e);
			return false;

		}
		
	}
	@Transactional
	public ForumComment getForumComment(int forumComment) {
		Session session = sessionFactory.openSession();
		ForumComment forumComment1 = (ForumComment) session.get(ForumComment.class, new Integer(ForumComment));
		return forumComment1;
		
	}
	@Transactional
	public List<ForumComment> getAllForumComments() {
		
		return sessionFactory.getCurrentSession().createQuery("from ForumComment").list();
	}

	

}
*/