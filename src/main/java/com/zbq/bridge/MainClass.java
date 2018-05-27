package com.zbq.bridge;

/**
 * Client类：
 */
public class MainClass {
    public static void main(String[] args) {  
        Engine engine2000 = new Engine2000();  
        Engine engine2200 = new Engine2200();  
          
        Car bus = new Bus(engine2000);  
        bus.installEngine();  
          
        Car jeep = new Jeep(engine2200);  
        jeep.installEngine();  
    }  
}  