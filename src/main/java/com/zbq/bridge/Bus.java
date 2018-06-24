package com.zbq.bridge;

/**
 * Refined Abstraction类：
 * 扩充抽象类
 */
public class Bus extends Car {
  
    public Bus(Engine engine) {  
        super(engine);  
    }  
      
    @Override  
    public void installEngine() {  
        System.out.print("Bus:");  
        this.getEngine().installEngine();  
    }  
  
}  