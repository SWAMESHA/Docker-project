package com.restapimapping.restapiexample.serviceImpl;

import com.restapimapping.restapiexample.entity.Subject;
import com.restapimapping.restapiexample.repository.SubjectRepository;
import com.restapimapping.restapiexample.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;


    @Override
    public Subject createdMethod(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public List<Subject> getAl() {
       return subjectRepository.findAll();
    }


}

