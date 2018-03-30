package com.zbq.singleton.singleton1;

import java.util.Objects;

/**
 * @author zhangboqing
 * @date 2018/2/26
 * <p>
 * 可行的解法：加同步锁前后两次判断实例是否存在
 */
public class Singleton3 {

    private static Singleton3 instance = null;

    //私有构造
    private Singleton3() {

    }

    public static Singleton3 getInstance() {

        //第一次判断
        if (Objects.isNull(instance)) {
            //同步代码块
            synchronized (Singleton3.class) {
                //第二次判断
                if (Objects.isNull(instance)) {
                    instance = new Singleton3();
                }

            }
        }
        return instance;
    }


}
