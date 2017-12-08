/*package socialnetworkBackend;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.niit.Config.DbConfig;
import com.niit.DAO.UserDetailDAO;
import com.niit.Model.UserDetail;


@ComponentScan("com.niit")
public class UserDetailTest {
static UserDetailDAO userDAO;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.register(DbConfig.class);
		context.scan("com.niit");
		context.refresh();
		
		userDAO=(UserDetailDAO)context.getBean("userDAO");
	}
	
	//@Ignore
	@Test
	public void addUserTest()
	{
		UserDetail user=new UserDetail();
		user.setUserId(1003);
		user.setFirstName("Rituparna");
		user.setLastName("chatterjee");
		user.setEmailId("rituparna.c@gmail.com");
		user.setPassword("12345");
		user.setRole("user");
		user.setStatus("N");
		user.setIsOnlime("Y");
		assertTrue("Problem in Inserting User",userDAO.addUser(user));
	
	}
	
	@Ignore
	@Test
	public void updateUser()
	{
UserDetail user=new UserDetail();
user.setUserId(1003);
user.setFirstName("sravani");
user.setLastName("m");
user.setEmailId("sravani.m452@gmail.com");
user.setPassword("12345");
user.setRole("user");
user.setStatus("Y");
user.setIsOnlime("Y");
assertTrue("Problem in Inserting User",userDAO.addUser(user));

	}
	
	@Ignore
	@Test
	public void getUserTest(){
		UserDetail user=(UserDetail)userDAO.getUser(1);
		
		System.out.println("FirstName:" + user.getFirstName());
		System.out.println("Role:" +user.getRole());
		
		assertNotNull("user not found", user);
	}
	
	@Ignore
	@Test
	public void deleteUserTest(){
		UserDetail user=(UserDetail)userDAO.getUser(1);
		assertTrue("Problem in deletion",userDAO.deleteUser(user));
	}
	@Ignore
	@Test
	public void approveUserTest(){
		UserDetail user=(UserDetail)userDAO.getUser(2);
		assertTrue("Problem in approving",userDAO.approveUser(user));
	}
	@Ignore
	@Test
	public void getAllUserTest(){
		List<UserDetail> userList=(List<UserDetail>)userDAO.getAllusers();
		assertNotNull("User list not found ",userList.get(0));
		for(UserDetail user:userList)
		{
			System.out.println("UserID:"+user.getUserId() + "FirstName:"+user.getFirstName());
		}
	}
		
	}
*/