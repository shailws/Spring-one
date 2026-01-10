package in.sp.beans;

public class Student {
	private String name;
	private int rollNO;
	private float marks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNO() {
		return rollNO;
	}

	public void setRollNO(int rollNO) {
		this.rollNO = rollNO;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Roll no : " + rollNO);
		System.out.println("Marks : " + marks);
	}

}
