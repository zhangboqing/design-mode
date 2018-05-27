package com.zbq.bridge;

/**
 * Abstraction类：
 */
public abstract class Car {
  
    private Engine engine;  
      
    public Car(Engine engine) {  
        this.engine = engine;  
    }  
  
    public Engine getEngine() {  
        return engine;  
    }  
  
    public void setEngine(Engine engine) {  
        this.engine = engine;  
    }  
      
    public abstract void installEngine();  
}  