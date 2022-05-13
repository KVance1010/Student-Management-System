package com.whitedragon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.whitedragon.model.Student;


// @Repository no longer need to use this because spring boot automatically does this because we used extending using jparepository
public interface StudentRepository extends JpaRepository<Student, Long> {
// 	this interface gives you access to crud features/methods
}
