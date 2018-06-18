package com.zbq.practicedemo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhangboqing
 * @date 2018/6/3
 */
public class ProxyDemo {


    public static void main(String[] args) {

    }


    public static Object getCacheProxy(Object object) {
        return Proxy.newProxyInstance(
                object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                (Object proxy, Method method, Object[] args)->{

                    //实现具体的缓存功能
                    System.out.println("代理前缓存处理！！！");
                    return  method.invoke(object,args);
                }
        );
    }



    public static Object getCacheProxy(Object object,InvocationHandler invocationHandler) {
        return Proxy.newProxyInstance(
                object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                invocationHandler
        );
    }
}
