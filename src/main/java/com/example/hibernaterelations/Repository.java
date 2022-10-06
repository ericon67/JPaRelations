package com.example.hibernaterelations;


import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Alien,Integer> {

}