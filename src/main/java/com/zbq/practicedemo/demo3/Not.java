package com.zbq.practicedemo.demo3;

/**
 * @author zhangboqing
 * @date 2018/6/24
 */
public class Not extends OperatorSymbol {

    public Not(Object a) {
        super(a, null);
    }

    @Override
    public boolean getResult() {

        if (a instanceof OperatorSymbol) {
            OperatorSymbol aa =  (OperatorSymbol) a;

            boolean aResult = aa.getResult();
            return !aResult;
         } else {

            return !(Boolean)a;
        }
    }


}
