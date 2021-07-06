package com.Sudhi.MappingSample.OneToMany.Controllers;

import com.Sudhi.MappingSample.OneToMany.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
}
