package com.zbq.practicedemo.demo2;

import org.springframework.util.StringUtils;

/**
 * @author zhangboqing
 * @date 2018/5/27
 */
public class DbOperatorWrap1 implements Operaror {

    private DbOperator operator;

    @Override
    public String read() {
        String result = readFromCache();

        if (StringUtils.isEmpty(result)) {
            return operator.read();
        }

        return result;
    }

    @Override
    public void write(String str) {
        operator.write(str);
    }

    public String readFromCache() {
        return "";
    }
}
