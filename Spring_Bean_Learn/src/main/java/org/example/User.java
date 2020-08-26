package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Value("1")
    private String uid;
    @Value("张三")
    private String uname;
    @Value("男")
    private String gender;
    @Value("18")
    private int age;
    @Autowired
    @Qualifier("classer")
    private Classer classer;

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", uname='" + uname + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", classer=" + classer.toString() +
                '}';
    }
}
