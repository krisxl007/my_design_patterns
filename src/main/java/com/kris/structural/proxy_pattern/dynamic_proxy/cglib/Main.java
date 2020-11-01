package com.kris.structural.proxy_pattern.dynamic_proxy.cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        // create proxy object in runtime
        TargetObject proxyObject = getProxy();
        proxyObject.sayHello();
        proxyObject.sayGoodbye();
    }

    private static TargetObject getProxy() {
        TargetObject targetObject = new TargetObject();

        // target object is needed when creating proxy object
        TargetObject proxyObject = (TargetObject) Enhancer.create(
                targetObject.getClass(),
                new MethodInterceptor() {
                    @Override
                    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                        if("sayHello".equals(method.getName())) {
                            System.out.println("Before calling sayHello()...");
                            Object result = method.invoke(targetObject, null);
                            System.out.println("After calling sayHello()...");

                            return result;
                        }else if("sayGoodbye".equals(method.getName())) {
                            System.out.println("Before calling sayGoodbye()...");
                            Object result = method.invoke(targetObject, null);
                            System.out.println("After calling sayGoodbye()...");

                            return result;
                        }else {
                            return method.invoke(targetObject, null);
                        }
                    }
                });

        return proxyObject;
    }

}
