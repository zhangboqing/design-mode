package com.zbq.observer.custom;

/**
 * 具体主题角色类
 *
 * 在运行时，这个客户端首先创建了具体主题类的实例，以及一个观察者对象。然后，它调用主题对象的attach()方法，将这个观察者对象向主题对象登记，也就是将它加入到主题对象的聚集中去。
 这时，客户端调用主题的change()方法，改变了主题对象的内部状态。主题对象在状态发生变化时，调用超类的notifyObservers()方法，通知所有登记过的观察者对象。
 */
public class ConcreteSubject extends Subject {
    
    private String state;
    
    public String getState() {
        return state;
    }

    public void change(String newState){
        state = newState;
        System.out.println("主题状态为：" + state);
        //状态发生改变，通知各个观察者
        this.nodifyObservers(state);
    }
}
