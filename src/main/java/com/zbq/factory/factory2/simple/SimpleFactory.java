package com.zbq.factory.factory2.simple;


import com.zbq.factory.factory2.Mengniu;
import com.zbq.factory.factory2.Milk;
import com.zbq.factory.factory2.Telunsu;
import com.zbq.factory.factory2.Yili;

/**
 */
public class SimpleFactory {

    public Milk getMilk(String name){
        if("特仑苏".equals(name)){
            return new Telunsu();
        }else if("伊利".equals(name)){
            return new Yili();
        }else if("蒙牛".equals(name)){
            return new Mengniu();
        }else {
            System.out.println("不能生产您所需的产品");
            return null;
        }
    }

}
