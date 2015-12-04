package com.varuchin.service;


public class HelloGuiceServiceImpl implements HelloGuiceService {


    public String serviceMethod(String msg) {
        return "Google Guice " + msg;
    }

}
