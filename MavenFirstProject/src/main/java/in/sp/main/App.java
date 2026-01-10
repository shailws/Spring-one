package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class App {
	public static void main(String[] args) {
		String configFile = "in/sp/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configFile);

		Student std = (Student) context.getBean("stdId");
		std.display();

	}
}
