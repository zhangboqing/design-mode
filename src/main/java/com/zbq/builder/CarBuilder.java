package com.zbq.builder;

/**
 * The builder abstraction.
 * 抽象builder类
 */
public interface CarBuilder {
    Car build();

    CarBuilder setColor(final String color);

    CarBuilder setWheels(final int wheels);
}