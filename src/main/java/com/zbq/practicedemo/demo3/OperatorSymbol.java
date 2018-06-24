package com.zbq.practicedemo.demo3;

/**
 * @author zhangboqing
 * @date 2018/6/24
 */
public abstract class OperatorSymbol {

    public Object a;
    public Object b;

    public OperatorSymbol(Object a, Object b) {
        this.a = a;
        this.b = b;
    }

    public abstract boolean getResult();

}
