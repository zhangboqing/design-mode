package com.zbq.adapter;

/**
 * Adapter(1)
 * 类适配器
 */
public class VoltClassAdapter extends Volt220 implements FiveVolt {
    @Override
    public int getVolt5() {
        return 5;
    }
}