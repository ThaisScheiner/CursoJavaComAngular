package com.aula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aula.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}