package com.kris.structural.proxy_pattern.dynamic_proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        // create proxy object in runtime
        CommonInterface proxyObject = getProxy();
        proxyObject.sayHello();
        proxyObject.sayGoodbye();
    }

    private static CommonInterface getProxy() {
        TargetObject targetObject = new TargetObject();

        // target object is needed when creating proxy object
        CommonInterface proxyObject = (CommonInterface) Proxy.newProxyInstance(
                targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),
                getInvocationHandler(targetObject));

        return proxyObject;
    }

    /**
     * InvocationHandler is where to add custom/additional logic.
     */
    private static InvocationHandler getInvocationHandler(final TargetObject targetObject) {
        return new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
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
        };
    }
}
