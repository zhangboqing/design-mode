package com.zbq.decorator;

/**
 * ConcreteComponent
 * 具体构件
 */
public class Man implements Person {

    @Override
    public void eat() {
        System.out.println("男人在吃");
    }
}