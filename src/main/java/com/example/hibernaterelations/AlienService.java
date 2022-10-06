package com.example.hibernaterelations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class AlienService {

    @Autowired
    private Repository AlienRepository;
    public List<Alien> listAllAliens() {
        return AlienRepository.findAll();
    }

    public void saveAlien(Alien alien) {
        AlienRepository.save(alien);
    }

    public Alien getAlien(Integer id) {
        return AlienRepository.findById(id).get();
    }

    public void deleteAlien(Integer id) {
        AlienRepository.deleteById(id);
    }
}