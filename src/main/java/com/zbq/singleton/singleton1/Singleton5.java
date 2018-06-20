package com.zbq.singleton.singleton1;

/**
 * @author zhangboqing
 * @date 2018/2/26
 * <p>
 * 强烈推荐的解法二：实现按需创建实例
 */
public class Singleton5 {


    //私有构造
    private Singleton5() {

    }

    public static Singleton5 getInstance() {

        return Nested.instance;
    }

    //内部类
    private static class Nested {

        private static Singleton5 instance = new Singleton5();

        private Nested() {

        }

    }

}
