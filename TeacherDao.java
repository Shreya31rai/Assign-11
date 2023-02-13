package org.antwalk.dao;

import java.util.List;

import org.antwalk.model.Teacher;



public interface TeacherDao {

	
	
	void create(String name, String address );
	 
	 Teacher getTeacher(Integer id);
	 
	 List listTeachers();
	 
	 void delete(Integer id);
	 
	 void update(Integer empid,String address);
}
