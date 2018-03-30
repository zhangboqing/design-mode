package com.zbq.singleton.singleton1;


import org.junit.Test;

/**
 * @author zhangboqing
 * @date 2018/2/26
 */
public class SingletonTest {

    @Test
    public void run() {

        Singleton1 instance = Singleton1.getInstance();

        System.out.println(instance);

    }


    @Test
    public void run2() {

        Singleton2 instance = Singleton2.getInstance();

        System.out.println(instance);

    }

    @Test
    public void run3() {

        Singleton3 instance = Singleton3.getInstance();

        System.out.println(instance);

    }


    @Test
    public void run4() {

        Singleton4 instance = Singleton4.getInstance();

        System.out.println(instance);

    }


    @Test
    public void run5() {
        Class<Singleton5> clazz = Singleton5.class;
        Class<?>[] classes = clazz.getClasses();
        for (Class<?> aClass : classes) {
            System.out.println(aClass);
        }

        Class<?>[] declaredClasses = clazz.getDeclaredClasses();
        for (Class<?> declaredClass : declaredClasses) {
            System.out.println(declaredClass);
        }
//        Singleton5 instance = null;
//        instance = Singleton5.getInstance();
//
//        System.out.println(instance);

    }
}
