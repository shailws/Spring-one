package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

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

//		-------------------------- SELECT OPERATION -------------------------------------------------
		String sql_query = "select * from student";
		jdbcTemplate.query(sql_query, null);
	}
}
