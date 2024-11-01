package com.example.utils;

import org.springframework.stereotype.Component;

@Component
//@Primary
public class Laptop implements Computer{
    public void compile(){
        System.out.println("compiling project using laptop");
    }
}
