package contacts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.contacts.dao.UserDao;
import com.example.contacts.service.UserService;

public class SpringTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) app.getBean("userService");
		UserDao userDao = (UserDao) app.getBean("userDao");
		System.out.println(userService == null);
		System.out.println(userDao == null);
	}
	
}
