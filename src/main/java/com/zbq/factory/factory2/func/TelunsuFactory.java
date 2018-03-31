package com.zbq.factory.factory2.func;


import com.zbq.factory.factory2.Milk;
import com.zbq.factory.factory2.Telunsu;

/**
 * 事情变得越来越专业
 */
public class TelunsuFactory implements Factory {

    @Override
    public Milk getMilk() {
        return new Telunsu();
    }
}
