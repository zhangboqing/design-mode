package com.zbq.factory.factory2.abstr;


import com.zbq.factory.factory2.Milk;

/**
 *
 * 抽象工厂是用户的主入口
 * 在Spring中应用得最为广泛的一种设计模式
 * 易于扩展
 */
public abstract class AbstractFactory {

    //公共的逻辑
    //方便于统一管理

    /**
     * 获得一个蒙牛品牌的牛奶
     * @return
     */
    public  abstract Milk getMengniu();

    /**
     * 获得一个伊利品牌的牛奶
     * @return
     */
    public abstract  Milk getYili();

    /**
     * 获得一个特仑苏品牌的牛奶
     * @return
     */
    public  abstract  Milk getTelunsu();

    public abstract Milk getSanlu();

}
