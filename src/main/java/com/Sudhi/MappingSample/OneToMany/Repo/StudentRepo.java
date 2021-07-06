package com.Sudhi.MappingSample.OneToMany.Repo;

import com.Sudhi.MappingSample.OneToMany.Entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student,Integer> {
}
