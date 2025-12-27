package in.sp.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Student stdId1() {
		Student std = new Student();

		std.setName("Chetan");
		std.setRollno(101);
		std.setEmail("chetan22@gmail.com");

		return std;
	}

	@Bean
	public Student stdId2() {
		Student std = new Student();

		std.setName("Ravi");
		std.setRollno(102);
		std.setEmail("ravi22@gmail.com");

		return std;
	}
}
