package socialnetworkBackend;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.niit.Config.DbConfig;
import com.niit.DAO.BlogDAO;
import com.niit.Model.Blog;


@ComponentScan("com.niit")
public class BlogTest {
static BlogDAO blogDAO;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.register(DbConfig.class);
		context.scan("com.niit");
		context.refresh();
		
		blogDAO=(BlogDAO)context.getBean("blogDAO");
	}
	
	@Test
	public void addBlogTest()
	{
		Blog blog=new Blog();
		
		blog.setBlogId(1003);
		blog.setBlogName("HTML");
		blog.setBlogContent("Designed for web pages");
		blog.setUsername("RIMI");
		blog.setStatus("p");
		blog.setLikes(40);
		blog.setCreateDate(new java.util.Date());
		
		assertTrue("Problem in Inserting Blog",blogDAO.addBlog(blog));
	
	}
	
	@Ignore
	@Test
	public void updateBlogTest()
	{
		Blog blog=(Blog)blogDAO.getBlog(1);
	    blog.setBlogName("HTML");
		blog.setBlogContent("web pages");
		blog.setBlogName("Rimi");
		assertTrue("Problem in updating Blog",blogDAO.addBlog(blog));
	}
	
	@Ignore
	@Test
	public void getBlogTest(){
		Blog blog=(Blog)blogDAO.getBlog(3);
		
		System.out.println("BlogName:" + blog.getBlogName());
		System.out.println("BlogContent:" +blog.getBlogContent());
		
		assertNotNull("blog not found", blog);
	}
	
	@Ignore
	@Test
	public void deleteBlogTest(){
		Blog blog=(Blog)blogDAO.getBlog(7);
		assertTrue("Problem in deletion",blogDAO.deleteBlog(blog));
	}
	@Ignore
	@Test
	public void approveBlogTest(){
		Blog blog=(Blog)blogDAO.getBlog(2);
		assertTrue("Problem in approving",blogDAO.approveBlog(blog));
	}
	@Ignore
	@Test
	public void getAllBlogTest(){
		List<Blog> blogList=(List<Blog>)blogDAO.getAllBlogs();
		assertNotNull("Blog list not found ",blogList.get(0));
		for(Blog blog:blogList)
		{
			System.out.println("BlogID:"+blog.getBlogId() + "BlogName:"+blog.getBlogName());
		}
	}
		
	}
	
