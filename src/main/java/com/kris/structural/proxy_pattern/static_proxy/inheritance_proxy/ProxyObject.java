package com.kris.structural.proxy_pattern.static_proxy.inheritance_proxy;

/**
 * This is the proxy object, the goal is to add extra logic without modifying target object.
 */
public class ProxyObject extends TargetObject{

    @Override
    public void sayHello() {
        System.out.println("Before calling sayHello()...");
        super.sayHello();
        System.out.println("After calling sayHello()...");
    }
}
