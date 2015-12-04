package com.varuchin;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.varuchin.Module.HelloGuiceModule;
import com.varuchin.service.HelloGuiceService;


public class HelloWorldGuiceMainClass {


    @Inject
    HelloGuiceService helloGuiceService;

    public static void main(String[] args) {

        HelloWorldGuiceMainClass helloWorldGuiceMainClass = new HelloWorldGuiceMainClass();

        Module module = new HelloGuiceModule();
        Injector injector = Guice.createInjector(module);
        HelloGuiceService helloGuiceService = injector.getInstance(HelloGuiceService.class);

        helloWorldGuiceMainClass.helloWorldGuice(helloGuiceService);
    }

    private void helloWorldGuice(HelloGuiceService helloGuiceService) {
        String testStr = helloGuiceService.serviceMethod("Hello World!");
        System.out.println(testStr);
    }
}
