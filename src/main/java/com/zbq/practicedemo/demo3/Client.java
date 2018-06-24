package com.zbq.practicedemo.demo3;

/**
 * @author zhangboqing
 * @date 2018/6/24
 */
public class Client {
    public static void main(String[] args) {

        System.out.println(new And(false,new Or(new Not(true),null)).getResult());

    }
}
