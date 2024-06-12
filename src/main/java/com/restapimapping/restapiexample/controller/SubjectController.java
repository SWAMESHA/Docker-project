package com.restapimapping.restapiexample.controller;

import com.restapimapping.restapiexample.entity.Subject;
import com.restapimapping.restapiexample.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;


    @PostMapping
    public Subject createdMethod(@RequestBody Subject subject) {
        return subjectService.createdMethod(subject);
    }

    @GetMapping
    public ResponseEntity<List<Subject>> getAllSubject() {
        return new ResponseEntity<>(subjectService.getAl(), HttpStatus.OK);
    }
}
