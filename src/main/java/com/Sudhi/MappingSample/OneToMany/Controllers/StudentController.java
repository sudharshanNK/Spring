package com.Sudhi.MappingSample.OneToMany.Controllers;

import com.Sudhi.MappingSample.OneToMany.Entity.Laptop;
import com.Sudhi.MappingSample.OneToMany.Entity.Student;
import com.Sudhi.MappingSample.OneToMany.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping(method = RequestMethod.POST, value = "/addSt")
    public Student addStudent(@RequestBody Student st) {
        Student student = studentService.addStudent(st);
        return student;

    }

    @RequestMapping(method=RequestMethod.DELETE,value="/deleteId/{id}")
    public void deleteStudentById(@PathVariable int id)
    {
        studentService.deleteStudentById(id);
    }

    @RequestMapping(method = RequestMethod.GET,value="/getStId/{rollno}")
    public Student getStudent(@PathVariable int rollno){
        return studentService.getStudentById(rollno);

    }
    @RequestMapping(method = RequestMethod.GET,value="/getSt")
    public List<Student> getSt()
    {
        return studentService.getStudents();
    }
}
