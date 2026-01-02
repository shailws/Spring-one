package in.sp.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subjects;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address returnAddrObj() {
		Address addr = new Address();

		addr.setHouseNo(100);
		addr.setCity("Pune");
		addr.setPincode(123456);

		return addr;
	}

	@Bean
	public Subjects returnSubObj() {
		Subjects subjs = new Subjects();

		List<String> subjects_list = new ArrayList<String>();
		subjects_list.add("Java");
		subjects_list.add("Python");
		subjects_list.add("C++");

		subjs.setSubjects(subjects_list);

		return subjs;
	}

	@Bean
	public Student returnStdObj() {
		Student std = new Student();

		std.setName("Shailesh");
		std.setRollNo(101);
//		std.setAddress(returnAddrObj()); manually di 
//		std.setSubjects(returnSubObj()); manually di

		return std;
	}
}
