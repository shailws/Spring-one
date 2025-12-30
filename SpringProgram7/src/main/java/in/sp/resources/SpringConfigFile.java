package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address returnAddrObj() {
		Address addr = new Address();
		addr.setHouseNo(100);
		addr.setCity("Pune");
		addr.setPinCode(123456);

		return addr;
	}

	@Bean
	public Student returnStudentObj() {
		Student std = new Student();
		std.setRollNo(101);
		std.setName("Shailesh");
		std.setAddress(returnAddrObj());

		return std;
	}
}
