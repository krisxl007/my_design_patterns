package com.kris.structural.proxy_pattern.static_proxy.interface_proxy;

public class Main {

    public static void main(String[] args) {
        TargetObject targetObject = new TargetObject();
        ProxyObject proxyObject = new ProxyObject(targetObject);
        proxyObject.sayHello();
    }
}
