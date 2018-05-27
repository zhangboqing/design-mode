package com.zbq.practicedemo.demo2;

/**
 * @author zhangboqing
 * @date 2018/5/27
 */
public class DbOperatorWrap2 implements Operaror {

    private DbOperatorWrap1 operator;

    @Override
    public String read() {
        return operator.read();
    }

    @Override
    public void write(String str) {
        securityCheck();
        operator.write(str);
    }

    public String securityCheck() {
        return "";
    }

}
