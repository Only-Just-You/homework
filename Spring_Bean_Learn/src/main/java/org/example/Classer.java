package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("classer")
public class Classer {
    @Value("1")
    private String cid;
    @Value("一班")
    private String cname;

    @Override
    public String toString() {
        return "Classer{" +
                "cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                '}';
    }
}
