package com.restapimapping.restapiexample.service;

import com.restapimapping.restapiexample.entity.Subject;

import java.util.List;

public interface SubjectService {
    Subject createdMethod(Subject subject);

    List<Subject> getAl();
}
