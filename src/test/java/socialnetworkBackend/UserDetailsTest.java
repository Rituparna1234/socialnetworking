package socialnetworkBackend;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Config.DbConfig;
import com.niit.DAO.UserDetailsDAO;
import com.niit.Model.UserDetails;


@ComponentScan("com.niit")
public class UserDetailsTest {

static UserDetailsDAO  userDAO;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.register(DbConfig.class);
		context.scan("com.niit");
		context.refresh();

		userDAO=(UserDetailsDAO)context.getBean("userdetailsDAO");
	}
	
	@Test
	public void addUserTest()
	{
		UserDetails user=new UserDetails();
		user.setUserId(13);
		user.setFirstName("abc");
		user.setLastName("xyz");
		user.setEmailId("abc@gmail.com");
		user.setPassword("2222");
		user.setRole("Admin");
		user.setStatus("available");
		user.setIsOnline("N");
		assertTrue("Problem in Inserting user", userDAO.addUserDetail(user));

	}
    @Ignore
	@Test
	public void getAllUserTest(){
		List<UserDetails> userList=(List<UserDetails>)userDAO.getAllUserDetails();
		assertNotNull("Job list not found ",userList.get(0));
		for(UserDetails user:userList)
		{
			System.out.println("EmailID:"+ user.getEmailId() + "Status:"+ user.getStatus());}
		}
		
		@Transactional
		@Ignore
		@Test
		public void getUserDetailsTest(){
			UserDetails user=(UserDetails)userDAO.getUserDetails("rimi");
			
			System.out.println("UserFirstname:" + user.getFirstName());
			System.out.println("UserRole:" + user.getRole());
			
			assertNotNull("UserDetail not found", user);
		}



		
	}
	

