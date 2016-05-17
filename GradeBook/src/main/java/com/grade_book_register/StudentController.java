package com.grade_book_register;




import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@EnableAutoConfiguration
public class StudentController {


		private final StudentRepository studentRepository;
		
		@Autowired
		public StudentController(StudentRepository studentRepository)
		{
			this.studentRepository = studentRepository;
		}
		
		@RequestMapping(value = "/students/add" , method = RequestMethod.POST)
		public void addStudent(@RequestBody Student student)
		{
			
			studentRepository.save(student);
		}
		
		@RequestMapping(value = "/students/deleteAll" , method = RequestMethod.DELETE)
		public void deleteAllStudents(@RequestBody Student student)
		{
			
			studentRepository.deleteAll();
		}
		
		
		@RequestMapping(value = "/students" , method = RequestMethod.GET)
		public List<Student> getStudents()
				{
					return studentRepository.findAll();
				}
	}
