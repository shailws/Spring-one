package in.sp.beans;

public class Student {
	private int rollNo;
	private String name;
	private Address address;

	public void setRollNo(int rollNo) {
		System.out.println("setter method rollNO");
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		System.out.println("setter method name");
		this.name = name;
	}

	public void setAddress(Address address) {
		System.out.println("setter method address");
		this.address = address;
	}

	public void display() {
		System.out.println("Rollno: " + rollNo);
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
	}

}
