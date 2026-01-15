package in.sp.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.beans.Student;
import in.sp.mappers.StudentRowMapper;
import in.sp.resources.SpringConfigFile;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

//	-------------------------- INSERT OPERATION -------------------------------------------------
//		int std_rollNo = 103;
//		String std_name = "sayali";
//		float std_marks = 80.2f;
//
//		String sql_query = "insert into student(std_rollNo, std_name, std_marks)values(?, ?, ?)";
//		int count = jdbcTemplate.update(sql_query, std_rollNo, std_name, std_marks);
//
//		if (count > 0) {
//			System.out.println("insertion success");
//		} else {
//			System.out.println("insertion failed");
//		}

//		-------------------------- UPDATE OPERATION -------------------------------------------------
//		float marks = 75.5f;
//		int roll = 101;
//
//		String sql_query = "update student set std_marks=? where std_rollNo=? ";
//		int count = jdbcTemplate.update(sql_query, marks, roll);
//
//		if (count > 0) {
//			System.out.println("updation success");
//		} else {
//			System.out.println("updation failed");
//		}

//		-------------------------- DELETE OPERATION -------------------------------------------------
//		int roll = 102;
//
//		String sql_query = "delete from student where std_rollNo=?";
//		int count = jdbcTemplate.update(sql_query, roll);
//
//		if (count > 0) {
//			System.out.println("delation success");
//		} else {
//			System.out.println("delation failed");
//		}

//		-------------------------- SELECT OPERATION 1 --------------------------------------------
//		String sql_query = "select * from student";
//		List<Student> std_list = jdbcTemplate.query(sql_query, new StudentRowMapper());
//
//		for (Student std : std_list) {
//			System.out.println("RollNo : " + std.getRollNo());
//			System.out.println("Name : " + std.getName());
//			System.out.println("Marks : " + std.getMarks());
//			System.out.println("-----------------------------------------------------");
//		}
//		
//		-------------------------- SELECT OPERATION 2 --------------------------------------------
//		int roll = 101;
//		String sql_query = "select * from student where std_rollNo =?";
//		List<Student> std_list = jdbcTemplate.query(sql_query, new StudentRowMapper(), roll);
//
//		for (Student std : std_list) {
//			System.out.println("RollNo : " + std.getRollNo());
//			System.out.println("Name : " + std.getName());
//			System.out.println("Marks : " + std.getMarks());
//			System.out.println("-----------------------------------------------------");
//		}

//		-------------------------- SELECT OPERATION 3 --------------------------------------------
		int roll = 102;
		String sql_query = "select * from student where std_rollNo =?";
		Student std = jdbcTemplate.queryForObject(sql_query, new StudentRowMapper(), roll);

		System.out.println("RollNo : " + std.getRollNo());
		System.out.println("Name : " + std.getName());
		System.out.println("Marks : " + std.getMarks());
		System.out.println("-----------------------------------------------------");
	}
}
