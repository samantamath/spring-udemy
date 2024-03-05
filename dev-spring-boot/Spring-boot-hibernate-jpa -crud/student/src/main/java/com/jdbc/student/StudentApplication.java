package com.jdbc.student;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.jdbc.student.entity.Student;
import com.jdbc.student.entity.StudentDAO;

import jakarta.transaction.Transactional;

@SpringBootApplication
public class StudentApplication implements  {
	Student stud1=new Student("ram","n","ram@gmail.com");
	Student stud2=new Student("seetha","n","seetha@gmail.com");
	//private String theLastName;

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner ->{
			//createstudent(studentDAO);
			//createmultiplestudents(studentDAO);
			//findId(studentDAO);
			//getALLStud(studentDAO);
			//getStudLN(studentDAO);
			//updateStud(studentDAO);
			//deletestud(studentDAO);
			deleteall(studentDAO);
		};
	
		
	}
//public void getStudLN(StudentDAO studentDAO) {
//	List<Student> getStudListLN=studentDAO.findByLn(lastName:"k");
//		// TODO Auto-generated method stub
//		
//	}
//	public void createmultiplestudents(StudentDAO studentDAO) {
//		// TODO Auto-generated method stub
//		
//		studentDAO.save(stud1);
//		studentDAO.save(stud2);
//		
//	};
//	public void findId(StudentDAO studentDAO) {
//		//Student getId=new Student();
//	Student findID=studentDAO.findById(stud1.getId());
//	System.out.println("found the student"+findID);
//	 //Student existingStudent = studentDAO.findById(1L).orElse(null);
//
//     
// }	
				
	private  void getALLStud(StudentDAO studentDAO) {
		List<Student> getStudList=studentDAO.findAll();
		for(Student getStud:getStudList) {
			System.out.println("list of students are\n"+getStud);
		}
	}
//	private void createstudent(StudentDAO studentDAO) {
//		// TODO Auto-generated method stub
//		
//		Student stud=new Student("sam","b","sam@gmail.com");
//		studentDAO.save(stud);
//		System.out.println("id od student is"+stud.getId());
//	}
	private void updateStud(StudentDAO studDAO) {
		
		int studId=1;
		Student mystud=studDAO.findById(studId);
		mystud.setFirstName("nova");
		studDAO.update(mystud);
		System.out.println("updated student"+mystud);
	}
	
	private void deletestud(StudentDAO studDAO) {
		int id =1;
		studDAO.delete(id);
		//System.out.println("deleted student is"+);
		
	
	}
	private void deleteall(StudentDAO studDAO) {
      studDAO.deleteall();
		
	}

}
