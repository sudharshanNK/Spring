package com.Sudhi.MappingSample.OneToMany.Controllers;

import com.Sudhi.MappingSample.OneToMany.Entity.Laptop;
import com.Sudhi.MappingSample.OneToMany.Entity.Student;
import com.Sudhi.MappingSample.OneToMany.Services.LaptopService;
import com.Sudhi.MappingSample.OneToMany.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class AddControllers {

        @Autowired
        private StudentService serviceSt;
        @Autowired
        private LaptopService serviceLp;

        @RequestMapping(method = RequestMethod.POST, value = "/addSt")
        public Student addStudent(@RequestBody Student st) {
            Student topic = serviceSt.addStudent(st);
            return topic;

        }

        @RequestMapping(method= RequestMethod.POST,value="/addLp")
    public Laptop addLaptop(@RequestBody Laptop lp)
        {
            Laptop laptop=serviceLp.addLaptop(lp);
            return laptop;
        }

        @RequestMapping(method=RequestMethod.DELETE,value="/deleteId/{id}")
        public void deleteLaptop(@PathVariable int id)
        {
            serviceLp.deleteLaptopById(id);
        }

        @RequestMapping(method = RequestMethod.GET,value="/getStId/{rollno}")
        public Student getStudent(@PathVariable int rollno){
            return serviceSt.getStudentById(rollno);

        }
        @RequestMapping(method = RequestMethod.GET,value="/getSt")
    public List<Student> getSt()
        {
            return serviceSt.getStudents();
        }

    }


