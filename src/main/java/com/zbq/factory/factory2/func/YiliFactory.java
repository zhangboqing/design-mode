package com.zbq.factory.factory2.func;


import com.zbq.factory.factory2.Milk;
import com.zbq.factory.factory2.Yili;

/**
 */
public class YiliFactory implements Factory {

    @Override
    public Milk getMilk() {
        return new Yili();
    }
}
