package com.zbq.responsibilityChain.handler;

import com.zbq.responsibilityChain.bean.Level;
import com.zbq.responsibilityChain.bean.Request;
import com.zbq.responsibilityChain.bean.Response;

public class ConcreteHandler2 extends Handler {
    protected Level getHandlerLevel() {
        return new Level(3);
    }

    public Response response(Request request) {
        System.out.println("-----请求由处理器2进行处理-----");
        return null;
    }
}