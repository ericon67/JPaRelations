package com.example.hibernaterelations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class LapService {
    @Autowired
    private LaptopRepository lapRepo;

    public void saveLap(Laptops laptop){
        lapRepo.save(laptop);

    }

    public List<Laptops> listAllLaps() {
        return lapRepo.findAll();
    }
}
