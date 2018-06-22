package com.zbq.multiton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 有限多例模式
 */
public class Multiton {
    private static final Multiton MULTITON_1 = new Multiton();
    private static final Multiton MULTITON_2 = new Multiton();
    private static List<Multiton> list = new ArrayList<Multiton>();     //用于放多个实例的list
    private static final int maxCount = 2;//最多的实例数  

    static {
        list.add(MULTITON_1);
        list.add(MULTITON_2);
    }

    private Multiton() {
    }//私有构造方法,避免外部创建实例

    /**
     * @description: 随机拿取实例
     */
    public static Multiton getInstance() {
        Random random = new Random();
        int current = random.nextInt(maxCount);
        return list.get(current);
    }

    /**
     * 工厂方法
     *
     * @param i
     * @return
     */
    public static Multiton getInstance2(int i) {
        switch (i) {
            case 1:
                return MULTITON_1;

            case 2:
                return MULTITON_2;
            default:
                return null;
        }

    }

    /**
     * @description: 指定拿取某一个实例
     */
    public static Multiton getInstance(int index) {
        return list.get(index);
    }
} 