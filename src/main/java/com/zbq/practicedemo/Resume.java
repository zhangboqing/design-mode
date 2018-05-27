package com.zbq.practicedemo;

import java.util.ArrayList;

/**
 * @author zhangboqing
 * @date 2018/5/19
 * <p>
 * 1. 现在有一个简历类Resume ，包括 名字，介绍，年龄，还有一组电话号码（List<String>类型）。
 * 现在，这个简历需要支持clone方法（深拷贝），请实现这个类。
 */
public class Resume implements Cloneable {

    private String name;
    private String introduce;
    private Integer age;
    private ArrayList<String> phoneList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public ArrayList<String> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(ArrayList<String> phoneList) {
        this.phoneList = phoneList;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", introduce='" + introduce + '\'' +
                ", age=" + age +
                ", phoneList=" + phoneList +
                '}';
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Resume clone = (Resume) super.clone();
        ArrayList<String> cloneList = (ArrayList<String>) phoneList.clone();
        clone.setPhoneList(cloneList);
        return clone;
    }
}
