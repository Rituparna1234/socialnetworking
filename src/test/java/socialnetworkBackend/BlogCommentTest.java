/*package socialnetworkBackend;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.BlogCommentDAO;
import com.niit.Model.BlogComment;


public class BlogCommentTest {


	static BlogCommentDAO blogCommentDAO;
	@BeforeClass
	public static void initialize(){
	      AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
	      annotationConfigApplicationContext.scan("com.niit");
	      annotationConfigApplicationContext.refresh();
	      blogCommentDAO=(BlogCommentDAO) annotationConfigApplicationContext.getBean("BlogCommentDAO");
	}
	@Test
	public void saveBlogCommenttest() {
		BlogComment blogComment=new BlogComment();
		blogComment.setBlogCommentId(101);
		blogComment.setBlogId(1005);
		blogComment.setComment("good");
		blogComment.setUserId(14);
		blogComment.setUsername("comments");
		
		assertTrue("problem occured",blogCommentDAO.saveBlogComment(blogComment));
	}
	@Ignore
	@Test
	public void deleteBlogComment(){
		BlogComment blogComment=(BlogComment)blogCommentDAO.getBlogComment(1);
		assertTrue("problem occured",blogCommentDAO.deleteBlogComment(blogComment));
	}
	@Ignore
	@Test
	public void updateCommentsBlog()
	{
		BlogComment blogComment=(BlogComment)blogCommentDAO.getBlogComment(2);
		blogComment.setComment("nice");
		blogComment.setUserId(501);
		assertTrue("forum is updated",blogCommentDAO.updateBlogComment(blogComment));
	}
	@Ignore
	@Test
	public void getAllBlogComments(){
		List<BlogComment>blogCommentsList=(List<BlogComment>)blogCommentDAO.getAllBlogComment();
		assertNotNull("Blog comment list not found",blogCommentsList.get(0));
		for(BlogComment blogComment:blogCommentsList)
		{
			System.out.println("blogcomment:::="+blogComment.getComment());
	}
	}
	@Ignore
	@Test
	public void getBlogComment(){
		BlogComment blogComment=(BlogComment)blogCommentDAO.getBlogComment(2);
		assertNotNull("error",blogComment);
		System.out.println("jobs desc is "+blogComment.getBlogCommentId());
		System.out.println("jobs profile"+blogComment.getComment());
	}
}
*/