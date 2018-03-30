package com.zbq.factory.factory1.factorymethod;

/**
 * @author zhangboqing
 * @date 2017/12/12
 * 工厂方法
 */
public abstract class FactoryMethod {

    public Object commonMethod(String type) {

        return createObject(type);
    }

    //TODO：该方法就是工厂方法
    public abstract Object createObject(String type);

}
