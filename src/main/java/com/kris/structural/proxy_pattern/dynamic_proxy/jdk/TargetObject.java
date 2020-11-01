package com.kris.structural.proxy_pattern.dynamic_proxy.jdk;

public class TargetObject implements CommonInterface {

    @Override
    public void sayHello() {
        System.out.println("Hello World!!!");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Goodbye World!!!");
    }
}
