package com.zbq.singleton;

/**
 * @author zhangboqing
 * @date 2018/2/26
 * <p>
 * 强烈推荐的解法一：利用静态构造函数
 */
public class Singleton4 {

    private static Singleton4 instance = new Singleton4();

    //私有构造
    private Singleton4() {

    }

    public static Singleton4 getInstance() {

        return instance;
    }


}
