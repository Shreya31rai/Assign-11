package org.antwalk.dao;

import java.util.List;

import org.antwalk.model.Teacher;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;


@Component
public class TeacherDaoImpl extends JdbcDaoSupport implements TeacherDao{
	public void create(String name, String address) {
		  
		try {
		 String SQL = "INSERT INTO Teacher (name, address) VALUES (?, ?)";
		 getJdbcTemplate().update(SQL, new Object[]{name, address} );
		System.out.println("Created Record Name = " + name + " Address= " + address);
		 // to simulate the exception.
		 throw new RuntimeException("simulate Error condition") ;
		  } catch (DataAccessException e) {
		       System.out.println("Error in creating record, rolling back");
		       throw e;
		    }
		}
	
	
	public Teacher getTeacher(Integer id) {
		  String SQL = "SELECT * FROM Teacher WHERE id = ?";
		  Teacher teacher = (Teacher) getJdbcTemplate().queryForObject(SQL, new Object[]{id}, new TeacherMapper());
		     return teacher;
		 }
	public List listTeachers() {
		  String SQL = "SELECT * FROM Teacher";
		  List teachers = (List) getJdbcTemplate().query(SQL, new TeacherMapper());
		     return null;
		 }
	
	public void delete(Integer id) {
		  String SQL = "DELETE FROM Teacher WHERE id = ?";
		  getJdbcTemplate().update(SQL, new Object[]{id});
		  System.out.println("Deleted Record with ID = " + id );
		 }
	
	public void update(Integer id, String address) {
		   String SQL = "UPDATE Taecher SET address = ? WHERE id = ?";
		   getJdbcTemplate().update(SQL, new Object[]{address, id});
		   System.out.println("Updated Record with EMPID = " + id );
		 }
	
}


