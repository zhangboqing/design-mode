package com.zbq.decorator;

/**
 * Decorator
 * 抽象装饰类
 */
public abstract class Decorator implements Person {

    protected Person person;
    
    public void setPerson(Person person) {
        this.person = person;
    }
    
    @Override
    public void eat() {
        person.eat();
    }
}