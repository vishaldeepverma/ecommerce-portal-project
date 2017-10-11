package UserTestCase;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.katykart.dao.UserDAO;
import com.katykart.model.UserDetails;

public class UserTestCase {
	public static void main(String arg[])
	{
	AnnotationConfigApplicationContext context3=new AnnotationConfigApplicationContext();
	
	context3.scan("com.katykart");
	
	context3.refresh();
	
	// Inserting a Category Object.
	UserDAO userDAO=(UserDAO)context3.getBean("userDAO");
	
	//Insertion TestCase
	
	UserDetails userdetails=new UserDetails();
	
	/*userdetails.setUsername("Vishal");
	userdetails.setPassword("vcssvdv3");
	userdetails.setEmail("vishaldeepverma@live.in");
	userdetails.setRole("user");
	userdetails.setMobileno(9559938669);
	userdetails.setAddress("This Mobile is WIFI Enabled. You can Enjoy");
	userDAO.insertUpdateUser(userdetails);		
	System.out.println("userdetails Inserted");*/
	
	//Retrieval TestCase
	
	/*UserDetails userdetails=userDAO.getUser("Vishal");
	System.out.println("Category password:"+userdetails.getPassword());
	System.out.println("Category Role:"+userdetails.getRole());*/
	
	//Deletion TestCase
	/*UserDetails userdetails=userDAO.getUser("vishal");
	userDAO.deleteUser(userdetails);
	System.out.println("The user  Deleted");*/
	
	//Retrieving the Data
	
	/*List<UserDetails> list=userDAO.getUserDetails();
	
	for(UserDetails user:list)
	{
		System.out.println(user.getUsername()+":"+user.getMobileno()+":"+user.getAddress()+":"+user.getEmail());
	}*/
	
	//Update the Category
	/*UserDetails user=userDAO.getUser("Vishal");
	user.setEmail("vishaldeepverma@live.in");
	userDAO.insertUpdateUser(user);
	System.out.println("The user Updated");*/
	
}


}
