package socialnetworkBackend;

import static org.junit.Assert.*;

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

static UserDetailDAO  userDAO;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.register(DbConfig.class);
		context.scan("com.niit");
		context.refresh();

		userDAO=(UserDetailDAO)context.getBean("userDAO");
	}
	@Ignore
	@Test
	public void addUserTest()
	{
		UserDetail user=new UserDetail();
		user.setUserId(13);
		user.setFirstName("ram");
		user.setLastName("raju");
		user.setEmailId("ram12@gmail.com");
		user.setPassword("1234");
		user.setRole("Admin");
		user.setStatus("available");
		user.setIsOnline("N");
		assertTrue("Problem in Inserting user", userDAO.addUserDetail(user));

	}
    @Ignore
	@Test
	public void getAllUserTest(){
		List<UserDetail> userList=(List<UserDetail>)userDAO.getAllUserDetails();
		assertNotNull("Job list not found ",userList.get(0));
		for(UserDetail user:userList)
		{
			System.out.println("EmailID:"+ user.getEmailId() + "Status:"+ user.getStatus());
		}
		
	}/*
		@Test
		public boolean updateOnlineStatus(){
			UserDetail user=userDAO.getUserDetails("Raju");
			assertTrue("problem in updating ", userDAO.updateOnlineStatus("Y", user));
			return user != null;
		}
	}*/
	
}
