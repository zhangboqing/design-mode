package com.zbq.responsibilityChain.handler;

import com.zbq.responsibilityChain.bean.Level;
import com.zbq.responsibilityChain.bean.Request;
import com.zbq.responsibilityChain.bean.Response;

public class ConcreteHandler3 extends Handler {
    protected Level getHandlerLevel() {
        return new Level(5);
    }

    public Response response(Request request) {
        System.out.println("-----请求由处理器3进行处理-----");
        return null;
    }
}
    