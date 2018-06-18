package com.zbq.factory.factory1.abstractfactory;

/**
 * @author zhangboqing
 * @date 2017/12/12
 * <p>
 * 抽象工厂
 */
public interface AbstractFactory {

    //TODO:抽象工厂，由多个工厂方法组成

    public Object createObject1();

    public Object createObject2();

    public Object createObject3();


    /**
     * 方便阅读，具体工厂实现类，放入同一个类
     */
    public class AbstractFactory1 implements AbstractFactory {

        @Override
        public Object createObject1() {
            return new Object1();
        }

        @Override
        public Object createObject2() {
            return new Object2();
        }

        @Override
        public Object createObject3() {
            return new Object3();
        }
    }

    /**
     * 方便阅读，具体产品，放入同一个类
     */
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
