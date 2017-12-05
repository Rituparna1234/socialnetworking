/*package socialnetworkBackend;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.ForumCommentDAO;
import com.niit.Model.ForumComment;


public class ForumCommentTest {
	static ForumCommentDAO forumCommentDAO;

	@BeforeClass
	public static void initialize() {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.scan("com.niit");
		annotationConfigApplicationContext.refresh();
		forumCommentDAO = (ForumCommentDAO) annotationConfigApplicationContext.getBean("forumCommentDAO");
	}

	
	@Test
	public void saveForumCommenttest() {
		ForumComment forumComment = new ForumComment();
		forumComment.setComment("liked");
		forumComment.setforumComment(101);
		forumComment.setForumId(118);
		forumComment.setUserId(103);
		forumComment.setUsername("comments");
		assertTrue("problem in saving", forumCommentDAO.saveForumComment(forumComment));
	}

	@Ignore
	@Test
	public void deleteForumComment() {
		ForumComment forumComment = (ForumComment) forumCommentDAO.getForumComment(1);
		assertTrue("problem in deleting", forumCommentDAO.deleteForumComment(forumComment));

	}

	@Ignore
	@Test
	public void updateForumComment() {
		ForumComment forumComment = (ForumComment) forumCommentDAO.getForumComment(2);
		forumComment.setComment("nice");
		forumComment.setUserId(501);
		assertTrue("forum is updated", forumCommentDAO.updateForumComment(forumComment));
	}

	@Ignore
	@Test
	public void getAllForumComment() {
		List<ForumComment> forumCommentsList = (List<ForumComment>) forumCommentDAO.getAllForumComments();
		assertNotNull("Forum comment list not found", forumCommentsList.get(0));
		for (ForumComment forumComment : forumCommentsList) {
			System.out.println("forumcomment:::=" + forumComment.getComment());
		}
	}

	@Test
	public void getForumComment() {
		ForumComment forumComment = (ForumComment) forumCommentDAO.getForumComment(2);
		assertNotNull("error", forumComment);
		System.out.println("forum username:: " + forumComment.getUsername());
		System.out.println("forumcomment::" + forumComment.getComment());
	}
}
	

*/