package com.example.hibernaterelations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class AlienController {

    @Autowired
    AlienService alienService;

        @PostMapping("/alien")

        public Alien postMap(@RequestBody Alien alien){
            System.out.println(alien);
            alienService.saveAlien(alien);

            return alien;
        }
    }

