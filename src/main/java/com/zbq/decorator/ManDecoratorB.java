package com.zbq.decorator;

/**
 * ConcreteDectrator
 * 具体装饰类
 */
public class ManDecoratorB extends Decorator {
    
    @Override
    public void eat() {
        super.eat();
        System.out.println("===============");
        System.out.println("ManDecoratorB类");
    }
}