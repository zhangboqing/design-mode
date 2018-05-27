package com.zbq.practicedemo.demo2;

/**
 * @author zhangboqing
 * @date 2018/5/27
 */
public class Folder extends FileClass {

    @Override
    public boolean isDirectory() {
        return true;
    }


    @Override
    public String[] list() {
        return super.list();
    }

}
