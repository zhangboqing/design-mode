package com.zbq.singleton.singleton1;

import java.util.Objects;

/**
 * @author zhangboqing
 * @date 2018/2/26
 *
 * 不好的解法二：虽然在多线程环境中能工作，但是效率不高
 */
public class Singleton2 {

    private static Singleton2 instance = null;

    //私有构造
    private Singleton2() {

    }

    public static Singleton2 getInstance() {

        //同步代码块
        synchronized (Singleton2.class){

            if (Objects.isNull(instance)) {
                instance = new Singleton2();
            }

        }
        return instance;
    }


}
