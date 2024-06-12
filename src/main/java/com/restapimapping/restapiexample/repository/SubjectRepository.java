package com.restapimapping.restapiexample.repository;

import com.restapimapping.restapiexample.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SubjectRepository extends JpaRepository<Subject, Long> {



}
