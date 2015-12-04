package com.varuchin.Module;

import com.google.inject.AbstractModule;
import com.varuchin.service.HelloGuiceService;
import com.varuchin.service.HelloGuiceServiceImpl;


public class HelloGuiceModule extends AbstractModule {

    protected void configure() {
        // add configuration logic here
        bind(HelloGuiceService.class).to(HelloGuiceServiceImpl.class);

    }

}
