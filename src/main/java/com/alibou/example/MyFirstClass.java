package com.alibou.example;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class MyFirstClass {
    public String sayHello() {
        return "Hello from the MyFirstClass";
    }
}
