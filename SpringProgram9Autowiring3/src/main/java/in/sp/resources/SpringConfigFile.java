package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address returnAddrObj1() {
		Address addr = new Address();

		addr.setHouseNo(100);
		addr.setCity("Pune");
		addr.setPincode(123456);

		return addr;
	}

	@Bean
	public Address returnAddrObj2() {
		Address addr = new Address();

		addr.setHouseNo(101);
		addr.setCity("Mumbai");
		addr.setPincode(654321);

		return addr;
	}

	@Bean
	public Student returnStdObj() {
		Student std = new Student();

		std.setName("Shailesh");
		std.setRollNo(101);
//		std.setAddress(returnAddrObj()); manually di 
		return std;
	}
}
