package com.springdemo.cruddemo;

import com.springdemo.cruddemo.dao.StudentDao;
import com.springdemo.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao) {
		return runner -> {
			//createStudent(studentDao);
			createMultipleStudents(studentDao);
			//findStudentsBYID(studentDao);
			//findALlStudents(studentDao);
			//queryForLastName(studentDao);
			//delete(studentDao);

		};
	}

	private void delete(StudentDao studentDao) {
		int id=4;
		studentDao.delete(id);

		//System.out.println();

	}

	private void queryForLastName(StudentDao studentDao) {
		List<Student> listofStudbylastname=studentDao.findByLastname("k");
		for(Student listofstud:listofStudbylastname){
			System.out.println(listofstud);
		}
	}

	private void findALlStudents(StudentDao studentDao) {
		List<Student> theStudents=studentDao.findAll();
		for(Student tempstudent:theStudents)
		{
			System.out.println("list of students are"+tempstudent);
		}


	}

	private void findStudentsBYID(StudentDao studentDao) {
		Student student=new Student("abc","xyz","gh");
		studentDao.save(student);
		System.out.println("id of the saved student"+student.getId());
		int theID= student.getId();
		Student idOfStud=studentDao.findByID(1);
		System.out.println("print the student"+idOfStud);


	}

	private void createMultipleStudents(StudentDao studentDao) {
		Student stud1=new Student("nabha","k","nabha@gmail.com");
		Student stud2=new Student("naksha","k","naksha@gmail.com");
		Student stud3=new Student("kavya","k","kavya@gmail.com");

		studentDao.save(stud1);
		studentDao.save(stud2);
		studentDao.save(stud3);
		System.out.println("id of students are" + stud1.getId() +stud2.getId() +stud3.getId());


	}

	private void createStudent(StudentDao studentDao) {
		Student stud=new Student("11","sam","sam@gmail.com");
		studentDao.save(stud);
		System.out.println("id of generated object is"+stud.getId());
	}
}


