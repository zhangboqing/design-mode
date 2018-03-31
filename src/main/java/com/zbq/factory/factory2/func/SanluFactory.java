package com.zbq.factory.factory2.func;


import com.zbq.factory.factory2.Milk;
import com.zbq.factory.factory2.Sanlu;

/**
 */
public class SanluFactory implements  Factory {
    @Override
    public Milk getMilk() {
        return new Sanlu();
    }
}
