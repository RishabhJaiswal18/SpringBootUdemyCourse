package com.example.jpacruddemostudent;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.jpacruddemostudent.dao.StudentDAO;
import com.example.jpacruddemostudent.entity.Student;

@SpringBootApplication
public class JpaCrudDemoStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaCrudDemoStudentApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			System.out.println("#### Server Started ####");
			System.out.println("----------------------------------------------------");
//			System.out.println("------------- Creating Student --------------");
//			createStudent(studentDAO);
//			createMultipleStudent(studentDAO);
//			readStudent(studentDAO);

//			queryForStudents(studentDAO);

//			studentListByLastName(studentDAO);

			updateStudent(studentDAO);
		};
	}

	private void updateStudent(StudentDAO studentDAO) {
		Student theStudent = studentDAO.findById(5);
		theStudent.setFirstName("Nice");

		studentDAO.update(theStudent);

		System.out.println("Updated Student = " + theStudent);
	}

	private void studentListByLastName(StudentDAO studentDAO) {
		List<Student> theStudents = studentDAO.findByLastName("Duck");

		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}

	}

	private void queryForStudents(StudentDAO studentDAO) {
		List<Student> theStudents = studentDAO.findAll();

		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		System.out.println("------- Creating Student --------");
		Student tempStudent = new Student("Daffy", "Duck", "daffyDuck@gmail.com");

		System.out.println("------- Saving the Student -------");

		studentDAO.save(tempStudent);

		int std_id = tempStudent.getStudentId();
		System.out.println("Saved student. Generation id: " + std_id);
		System.out.println("-----------------------------------------------------");
		System.out.println("Retreiving the student with id: " + std_id);

		Student myStudent = studentDAO.findById(std_id);

		if (myStudent != null) {
			System.out.println("----------- Student Found ----------");
			System.out.println(myStudent);
		} else {
			System.out.println("------------ Student Not Found ----------------");
		}
	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		Student tempStudent1 = new Student("AAA", "BBB", "aaBBB@gmail.com");
		Student tempStudent2 = new Student("CCC", "DDD", "ccDD@gmail.com");
		Student tempStudent3 = new Student("EEE", "FFF", "eeFF@gmail.com");
		System.out.println("-------- Saving the Multiple created student -------------");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

		System.out.println("Saved Student. Generated Id: " + tempStudent1.getStudentId());
		System.out.println("Saved Student. Generated Id: " + tempStudent2.getStudentId());
		System.out.println("Saved Student. Generated Id: " + tempStudent3.getStudentId());
	}

	private void createStudent(StudentDAO studentDAO) {
		Student tempStudent = new Student("Jitender", "Verma", "verma.jitender@gmail.com");
		System.out.println("-------- Saving the created student -------------");
		studentDAO.save(tempStudent);

		System.out.println("Saved Student. Generated Id: " + tempStudent.getStudentId());
	}

}
