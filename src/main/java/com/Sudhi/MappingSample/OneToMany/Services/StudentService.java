package com.Sudhi.MappingSample.OneToMany.Services;

import com.Sudhi.MappingSample.OneToMany.Entity.Student;
import com.Sudhi.MappingSample.OneToMany.Exceptions.IdNotFoundException;
import com.Sudhi.MappingSample.OneToMany.Repo.StudentRepo;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepo stRepo;
    public Student addStudent(Student st) {
        return stRepo.save(st);
    }

    public Student getStudentById(int id){
        Optional<Student> student= stRepo.findById(id);
        if(!( student.isPresent())){
            throw new IdNotFoundException("Student is not present in that id");
        }
        return student.get();
    }
    public List<Student> getStudents(){
        return (List<Student>) stRepo.findAll();
    }

    public void deleteStudentById(int id) {
        stRepo.deleteById(id);
    }
}
