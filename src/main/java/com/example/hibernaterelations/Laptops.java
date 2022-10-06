package com.example.hibernaterelations;

import javax.persistence.*;

@Entity
public class Laptops {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Lid;

    @ManyToOne
                                   //if this need to be many to many, make list of aliens as did for laptops. and change the anotation to many to many
    private Alien alien;

    public int getLid() {
        return Lid;
    }

    public void setLid(int lid) {
        Lid = lid;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }


    private String Brand;
    private String Price;

    public Alien getAlien() {
        return alien;
    }

    public void setAlien(Alien alien) {
        this.alien = alien;
    }
}
