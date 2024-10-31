package com.example.utills;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
//    @Qualifier("laptop")
    private Computer computer;

//    private Laptop laptop;

//    public Dev(Laptop laptop){
//        this.laptop = laptop;
//    }

    public Dev(Computer computer) {
        this.computer = computer;
    }

    public void build() {
        computer.compile();
        System.out.println("Building Project");
    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    @Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }
}
