package com.zbq.responsibilityChain;

import com.zbq.responsibilityChain.bean.Level;
import com.zbq.responsibilityChain.bean.Request;
import com.zbq.responsibilityChain.bean.Response;
import com.zbq.responsibilityChain.handler.ConcreteHandler1;
import com.zbq.responsibilityChain.handler.ConcreteHandler2;
import com.zbq.responsibilityChain.handler.ConcreteHandler3;
import com.zbq.responsibilityChain.handler.Handler;

public class Client {
       public static void main(String[] args){  
           Handler handler1 = new ConcreteHandler1();
           Handler handler2 = new ConcreteHandler2();
           Handler handler3 = new ConcreteHandler3();
     
           handler1.setNextHandler(handler2);  
           handler2.setNextHandler(handler3);  
             
           Response response = handler1.handleRequest(new Request(new Level(4)));
       }  
   }