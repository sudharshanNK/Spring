package com.Sudhi.MappingSample.OneToMany.Services;

import com.Sudhi.MappingSample.OneToMany.Entity.Laptop;
import com.Sudhi.MappingSample.OneToMany.Entity.Student;
import com.Sudhi.MappingSample.OneToMany.Repo.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepo lapRepo;
    public Laptop addLaptop(Laptop lp) {
        return lapRepo.save(lp);

    }

    public void deleteLaptopById(int id){
        lapRepo.deleteById(id);
    }

    public Laptop getLaptopById(int id) {
        Optional<Laptop> laptop = lapRepo.findById(id);
        return laptop.get();
    }

    public List<Laptop> getAllLaptops() {
        return (List<Laptop>) lapRepo.findAll();
    }
}
