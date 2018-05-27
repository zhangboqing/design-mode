package com.zbq.practicedemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author zhangboqing
 * @date 2018/5/19
 */
public class ManagerFactory {

    private static final Map<Integer, Manager> managerMap = new HashMap();


    public static Manager getManagerByTenantId(Integer tenantId) {
        Manager manager = managerMap.get(tenantId);

        if (Objects.isNull(manager)) {
            synchronized (ManagerFactory.class) {
                if (Objects.isNull(manager)) {
                    manager = new Manager();
                    managerMap.put(tenantId, manager);
                }
            }
        }

        return manager;
    }


    public static void main(String[] args) {

        System.out.println( ManagerFactory.getManagerByTenantId(1));
        System.out.println(ManagerFactory.getManagerByTenantId(2));
        System.out.println(ManagerFactory.getManagerByTenantId(3));

    }

}
