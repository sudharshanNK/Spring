package com.Sudhi.MappingSample.OneToMany.Repo;

import com.Sudhi.MappingSample.OneToMany.Entity.Laptop;
import org.springframework.data.repository.CrudRepository;

public interface LaptopRepo extends CrudRepository<Laptop,Integer> {

}
