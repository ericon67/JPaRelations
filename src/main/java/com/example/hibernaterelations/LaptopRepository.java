package com.example.hibernaterelations;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository <Laptops, Integer> {
}
