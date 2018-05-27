package com.zbq.practicedemo.demo2;

/**
 * @author zhangboqing
 * @date 2018/5/27
 */
public class File extends FileClass {

    @Override
    public boolean isFile() {
        return true;
    }

    @Override
    public String read() {
        return super.read();
    }

    @Override
    public void write(String content) {
        super.write(content);
    }
}
