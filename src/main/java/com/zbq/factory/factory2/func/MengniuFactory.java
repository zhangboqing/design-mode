package com.zbq.factory.factory2.func;


import com.zbq.factory.factory2.Mengniu;
import com.zbq.factory.factory2.Milk;

/**
 */
public class MengniuFactory implements  Factory {


    @Override
    public Milk getMilk() {
        return new Mengniu();
    }
}
