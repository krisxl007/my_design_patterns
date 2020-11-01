package com.kris.structural.proxy_pattern.static_proxy.interface_proxy;

public class TargetObject implements CommonInterface{

    @Override
    public void sayHello() {
        System.out.println("Hello World!!!");
    }
}
