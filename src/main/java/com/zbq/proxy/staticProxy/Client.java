package com.zbq.proxy.staticProxy;

/**
 * client
 */
public class Client {


    public static void main(String[] args) {
        Subject subject = new ProxySubject();
        subject.request();  //代理者代替真实者做事情
    }

}
