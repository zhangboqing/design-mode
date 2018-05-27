package com.zbq.factory.demo;

/**
 * @author zhangboqing
 * @date 2018/5/13
 */
public class TestDemo {

    public static void main(String[] args) {

        //红色皮肤
        RedSkinFactory redSkinFactory = new RedSkinFactory();
        //黑色皮肤
        BlackSkinFactory blackSkinFactory = new BlackSkinFactory();
        //蓝色皮肤
        BlueSkinFactory blueSkinFactory = new BlueSkinFactory();

        TestDemo.changeSkin(redSkinFactory);
        TestDemo.changeSkin(blackSkinFactory);
        TestDemo.changeSkin(blueSkinFactory);

    }


    public static void changeSkin(AbstractSkinFactory skinFactory) {
        System.out.println(skinFactory.createUIHandler().toString());
    }
}
