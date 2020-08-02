package com.kris.creational.singleton_pattern;

/**
 * Lazy initialization method to implement Singleton pattern creates the instance in the global access method.
 * Suppose to be used in single thread application only.
 */
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    /**
     * This method works fine in case of single threaded environment but when it comes to multithreaded systems,
     * it can cause issues if multiple threads are inside the if loop at the same time. It will destroy the singleton
     * pattern and both threads will get the different instances of singleton class.
     */
    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
