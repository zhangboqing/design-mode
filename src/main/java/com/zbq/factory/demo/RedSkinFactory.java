package com.zbq.factory.demo;

/**
 * @author zhangboqing
 * @date 2018/5/13
 */
public class RedSkinFactory implements AbstractSkinFactory {
    @Override
    public AbstractUIHandler createUIHandler() {
        return new AbstractUIHandler() {
            @Override
            public String toString() {
                return "已变更为:红色皮肤";
            }
        };
    }
}
