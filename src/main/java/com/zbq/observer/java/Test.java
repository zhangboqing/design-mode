package com.zbq.observer.java;

import java.util.Observer;

/**
 * 测试类源代码
 * Test对象首先创建了Watched和Watcher对象。在创建Watcher对象时，将Watched对象作为参数传入；然后Test对象调用Watched对象的setData()方法，触发Watched对象的内部状态变化；Watched对象进而通知实现登记过的Watcher对象，也就是调用它的update()方法。
 */
public class Test {

    public static void main(String[] args) {
        
        //创建被观察者对象
        Watched watched = new Watched();
        //创建观察者对象，并将被观察者对象登记
        Observer watcher = new Watcher(watched);
        //给被观察者状态赋值
        watched.setData("start");
        watched.setData("run");
        watched.setData("stop");

    }

}