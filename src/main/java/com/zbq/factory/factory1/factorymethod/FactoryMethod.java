package com.zbq.factory.factory1.factorymethod;

/**
 * @author zhangboqing
 * @date 2017/12/12
 * 工厂方法
 */
public abstract class FactoryMethod {

    //TODO：该方法就是工厂方法
    public abstract Object createObject(String type);


    /** 方便阅读，具体工厂实现类，放入同一个类 */
    public class FactoryMethod1 extends FactoryMethod {

        //子类必须实现抽象工厂方法，决定到底生产哪个对象
        @Override
        public Object createObject(String type) {
            //生成
            return new Object1();
        }
    }

    public class FactoryMethod2 extends FactoryMethod {

        //子类必须实现抽象工厂方法，决定到底生产哪个对象
        @Override
        public Object createObject(String type) {
            //生成
            return new Object2();
        }
    }

    public class FactoryMethod3 extends FactoryMethod {

        //子类必须实现抽象工厂方法，决定到底生产哪个对象
        @Override
        public Object createObject(String type) {
            //生成
            return new Object3();
        }
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
