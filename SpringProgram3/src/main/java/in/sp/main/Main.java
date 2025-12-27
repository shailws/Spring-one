package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] args) {

		String resource_file_pasth = "/in/sp/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(resource_file_pasth);

		Student std1 = (Student) context.getBean("student");
		std1.display();
	}
}
