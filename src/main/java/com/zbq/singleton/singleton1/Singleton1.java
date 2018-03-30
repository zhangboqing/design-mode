package com.zbq.singleton.singleton1;

import java.util.Objects;

/**
 * @author zhangboqing
 * @date 2018/2/26
 *
 * 不好的解法一：只适用单线程环境
 */
public class Singleton1 {

    private static Singleton1 instance = null;

    //私有构造
    private Singleton1() {

    }

    public static Singleton1 getInstance() {

        if (Objects.isNull(instance)) {
            instance = new Singleton1();
        }

        return instance;
    }

}



