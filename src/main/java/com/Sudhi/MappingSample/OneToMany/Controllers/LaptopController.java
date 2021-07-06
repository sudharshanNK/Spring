package com.Sudhi.MappingSample.OneToMany.Controllers;

import com.Sudhi.MappingSample.OneToMany.Entity.Laptop;
import com.Sudhi.MappingSample.OneToMany.Entity.Student;
import com.Sudhi.MappingSample.OneToMany.Services.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    LaptopService laptopService;

    @RequestMapping(method= RequestMethod.POST,value="/addLp")
    public Laptop addLaptop(@RequestBody Laptop lp)
    {
        Laptop laptop=laptopService.addLaptop(lp);
        return laptop;
    }

    @RequestMapping(method=RequestMethod.DELETE,value="/deleteLpId/{id}")
    public void deleteLaptop(@PathVariable int id)
    {
        laptopService.deleteLaptopById(id);
    }

    @RequestMapping(method = RequestMethod.GET,value="/getLaptopById/{id}")
    public Laptop getLaptopById(@PathVariable int id){
        return laptopService.getLaptopById(id);

    }
    @RequestMapping(method = RequestMethod.GET,value="/getSt")
    public List<Laptop> getLaptops()
    {

        return laptopService.getAllLaptops();
    }
}
