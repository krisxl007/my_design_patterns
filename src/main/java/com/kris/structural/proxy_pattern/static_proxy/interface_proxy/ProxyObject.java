package com.kris.structural.proxy_pattern.static_proxy.interface_proxy;

import com.kris.structural.proxy_pattern.static_proxy.inheritance_proxy.TargetObject;

/**
 * This is the proxy object, the goal is to add extra logic without modifying target object.
 */
public class ProxyObject implements CommonInterface {

    private CommonInterface targetObject;

    public ProxyObject(CommonInterface targetObject) {
        this.targetObject = targetObject;
    }

    @Override
    public void sayHello() {
        System.out.println("Before calling sayHello()...");
        targetObject.sayHello();
        System.out.println("After calling sayHello()...");
    }
}
