package com.zbq.factory.factory1.simplefactory;

/**
 * @author zhangboqing
 * @date 2017/12/12
 * 简单工厂
 */
public class SimpleFactory {

    /**
     * 第一种形式
     * 调用指定方法，直接返回对象
     * @return
     */
    public static Object createObject() {

        return new Object();
    }

    /**
     * 第二种形式
     * 根据指定的type，获取对应的对象
     * @param type
     * @return
     */
    public static Object createObject(Integer type) {

        if (type.equals(1)) {
            return new Object1();
        } else if (type.equals(2)) {
            return new Object2();
        } else if (type.equals(3)) {
            return new Object3();
        }
        return null;
    }


    /** 方便阅读，具体产品，放入同一个类 */
    public static class Object1 {

        private static String name = "对象1";
    }

    public static class Object2 {
        private static String name = "对象2";
    }

    public static class Object3 {
        private static String name = "对象3";

    }

}
