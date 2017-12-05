/*package socialnetworkBackend;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.niit.DAO.FriendDAO;
import com.niit.Model.Friend;

@ComponentScan("com.niit")
public class FriendTest {

	static FriendDAO friendDAO;
	@BeforeClass
	public static void initialize()
	{
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.scan("com.niit");
		annotationConfigApplicationContext.refresh();
		friendDAO = (FriendDAO) annotationConfigApplicationContext.getBean("friendDAO");
	}
	
	@Test
	public void addFriend() {
		Friend friend=new Friend();
		friend.setStatus("friends list");
		friend.setFriendId(1);
		friend.setUserId(1);
		assertTrue("problem in friend",friendDAO.addFriend(friend));		
	}
	@Ignore
	@Test
	public void deleteFriend()
	{
		Friend friend=(Friend)friendDAO.getFriend(1);
		assertTrue("problem in deleting ",friendDAO.deleteFriend(friend));
	}
	@Ignore
	@Test
	public void updateFriend()
	{
		Friend friend=(Friend)friendDAO.getFriend(2);
		friend.setStatus("unfriend");
		assertTrue("problem in updating",friendDAO.updateFriend(friend));
	}
	@Ignore
	@Test
	public void getAllFriend()
	{
		List<Friend> friendList = (List<Friend>) friendDAO.getAllFriend();
		assertNotNull("blog is null", friendList.get(0));
		for (Friend friend : friendList) {
			System.out.println("Friend is" + friend.getStatus());
		}
	}
	@Ignore
	@Test
	public void getFriendId()
	{
		Friend friend=(Friend)friendDAO.getFriend(2);
		assertNotNull("error",friend);
		System.out.println("friend status::::"+friend.getStatus());
		System.out.println("friend id::::"+friend.getFriendId());
	}
}



*/