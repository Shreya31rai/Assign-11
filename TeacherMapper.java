package org.antwalk.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.antwalk.model.Teacher;
import org.springframework.jdbc.core.RowMapper;

public class TeacherMapper implements RowMapper {  
	 public Teacher mapRow(ResultSet rs, int rowNum) throws SQLException {  
	  Teacher teacher = new Teacher();  
	  teacher.setId(rs.getInt("id"));  
	  teacher.setName(rs.getString("name"));  
	  teacher.setAddress(rs.getString("address"));  
	
	  return teacher;  
	 }  
}

