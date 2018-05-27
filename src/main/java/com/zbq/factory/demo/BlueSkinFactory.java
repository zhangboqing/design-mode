package com.zbq.factory.demo;

/**
 * @author zhangboqing
 * @date 2018/5/13
 */
public class BlueSkinFactory implements AbstractSkinFactory {
    @Override
    public AbstractUIHandler createUIHandler() {
        return new AbstractUIHandler() {
            @Override
            public String toString() {
                return "已变更为:蓝色皮肤";
            }
        };
    }
}
