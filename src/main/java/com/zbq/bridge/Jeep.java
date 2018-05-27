package com.zbq.bridge;

/**
 * Refined Abstraction类：
 */
public class Jeep extends Car {
  
    public Jeep(Engine engine) {  
        super(engine);  
    }  
    @Override  
    public void installEngine() {  
        System.out.print("Jeep:");  
        this.getEngine().installEngine();  
    }  
  
}  