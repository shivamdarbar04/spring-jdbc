package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

  public class StudentDaoImpl implements StudentDao
  {
  private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		//insert data
		String query = "insert into student(id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}

//	public int change(Student student) 
//	  {
//			String query = "update student set name=? , city=? where id=?";
//			int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
//			return r;
//		}
//
//	public int delete(int studentID) 
//	{
//	   String query = " delete from student where id =? ";
//	   int r = this.jdbcTemplate.update(query,studentID);
//		return r;
//	}
//
//	public Student getStudent(int studentId) {
//	//selecting single student data
//		String query = " select * from student where id =? ";
//		RowMapper<Student> rowMapper = new RowMapperImpl();
//		Student student = this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
//		
//		return student;
//	}
	
	public JdbcTemplate getJdbcTemplate()
	{
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	

	
}
