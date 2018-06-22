package com.zbq.adapter;

/**
 * Adapter(2)
 * 对象适配器
 */
public class VoltObjectAdapter implements FiveVolt {
    Volt220 volt220;

    public VoltObjectAdapter(Volt220 volt220) {
        this.volt220 = volt220;
    }

    @Override
    public int getVolt5() {
        return 5;
    }

    public int getVolt220() {
        return volt220.getVolt220();
    }
}