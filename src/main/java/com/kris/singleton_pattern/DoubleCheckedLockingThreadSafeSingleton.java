package com.kris.singleton_pattern;

/**
 *  the synchronized block is used inside the if condition with an additional check to ensure that only one instance of singleton class is created
 */
public class DoubleCheckedLockingThreadSafeSingleton {

    private static DoubleCheckedLockingThreadSafeSingleton instance;

    private DoubleCheckedLockingThreadSafeSingleton(){}

    public static DoubleCheckedLockingThreadSafeSingleton getInstanceUsingDoubleLocking(){
        if(instance == null){
            synchronized (DoubleCheckedLockingThreadSafeSingleton.class) {
                if(instance == null){
                    instance = new DoubleCheckedLockingThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
