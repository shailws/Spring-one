package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address returnAddrObj() {
		Address addr = new Address(200, "Mumbai", 123321);

		return addr;
	}

	@Bean
	public Student returnStudentObj() {
		Student std = new Student(102, "Abhi", returnAddrObj());

		return std;
	}
}
