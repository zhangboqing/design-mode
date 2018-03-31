package com.zbq.singleton.singleton2.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 */

//Spring中的做法，就是用这种注册式单例
public class BeanFactory {

    private BeanFactory(){}

    //线程安全
    private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();

    public static Object getBean(String className){

        if(!ioc.containsKey(className)){
            Object obj = null;
            try {
                obj = Class.forName(className).newInstance();
                ioc.put(className,obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return obj;
        }else{
            return ioc.get(className);
        }

    }


}
