package com.example.service;

import javax.ejb.Stateless;

@Stateless
public class ExampleService {

    public String whoAmI() {
        return "i'm ExampleService";
    }

}
