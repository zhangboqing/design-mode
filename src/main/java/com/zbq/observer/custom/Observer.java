package com.zbq.observer.custom;

/**
 * Observer
 * 观察者
 * 抽象观察者角色类
 */
public interface Observer {
    /**
     * 更新接口
     * @param state    更新的状态
     */
    public void update(String state);
}