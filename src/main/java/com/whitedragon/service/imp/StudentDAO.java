package com.whitedragon.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whitedragon.model.Student;
import com.whitedragon.repository.StudentRepository;
import com.whitedragon.service.StudentService;

@Service
public class StudentDAO implements StudentService {

/*  This is Constructor Injection
*   
*	private StudentRepository studentRepository;
*
*	public StudentDAO(StudentRepository studentRepository) {
*		this.studentRepository = studentRepository;
*	}
*/	
	
/*  This is Setter Injection
*   
*	private StudentRepository studentRepository;
*
*   @Autowire  // requires autowire and setter
*	public setStudentDAO(StudentRepository studentRepository) {
*		this.studentRepository = studentRepository;
*	}
*/		

/*  This is Field Injection
*   
*   @Autowire
*	private StudentRepository studentRepository;
*/		
	
	private StudentRepository studentRepository;

	@Autowired // name is optional and so is autowire because there is only one constructor
	public StudentDAO(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
	}

}