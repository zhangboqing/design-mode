package com.zbq.practicedemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangboqing
 * @date 2018/5/19
 */
public class TestDemo {


    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resume = new Resume();
        resume.setName("name");
        resume.setIntroduce("introduce");
        resume.setAge(11);

        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        resume.setPhoneList(list);


        Resume cloneResume = (Resume) resume.clone();
        cloneResume.setName("cloneName");


        List<String> phoneList = resume.getPhoneList();
        phoneList.add("3");


        System.out.println(resume);
        System.out.println(cloneResume);

    }
}
