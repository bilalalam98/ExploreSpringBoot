package com.trmab.SpringBootFirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

//to tell application context to make object of thi
@Component
public class Alien {

    //now i want to get my laptop object form container this is shere we get concept of wiring
    @Autowired
    Laptop laptop;
    public void code (){
        laptop.compile();
    }
}
