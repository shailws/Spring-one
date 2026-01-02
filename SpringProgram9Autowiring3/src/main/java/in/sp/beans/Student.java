package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private String name;
	private int rollNo;

	@Autowired
	@Qualifier("returnAddrObj2")
	private Address address;

	public void setName(String name) {
		this.name = name;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Roll no : " + rollNo);
		System.out.println("Address : " + address);
	}

}
