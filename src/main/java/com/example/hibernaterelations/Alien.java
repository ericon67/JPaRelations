package com.example.hibernaterelations;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Alien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;


    @OneToMany(mappedBy = "alien")

    private List<Laptops> laptop = new ArrayList<Laptops>();

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    private String Name;

    @Override
    public String toString() {
        return "Alien{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Color='" + Color + '\'' +
                '}';
    }

    private String Color;

    public List<Laptops> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptops> laptop) {
        this.laptop = laptop;
    }
}
