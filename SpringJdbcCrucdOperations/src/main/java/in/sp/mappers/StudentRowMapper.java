package in.sp.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;

import in.sp.beans.Student;

public class StudentRowMapper implements org.springframework.jdbc.core.RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

		Student std = new Student();

		std.setRollNo(rs.getInt("std_rollNo"));
		std.setName(rs.getString("std_name"));
		std.setMarks(rs.getFloat("std_marks"));

		return std;
	}

}
