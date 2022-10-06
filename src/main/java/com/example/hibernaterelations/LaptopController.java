package com.example.hibernaterelations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/")
public class LaptopController {
    @Autowired
    LapService laptopService;

    @PostMapping("/laptop")

    public Laptops postMap(@RequestBody Laptops laptop){
        System.out.println(laptop);
        laptopService.saveLap(laptop);
       // Collection<Laptops>lap = laptop.listAllLaps();

        return laptop;
    }
}
