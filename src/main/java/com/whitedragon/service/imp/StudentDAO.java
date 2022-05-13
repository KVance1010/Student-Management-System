package com.whitedragon.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whitedragon.model.Student;
import com.whitedragon.repository.StudentRepository;
import com.whitedragon.service.StudentService;

@Service
public class StudentDAO implements StudentService {

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