package com.zbq.practicedemo.demo3;

/**
 * @author zhangboqing
 * @date 2018/6/24
 */
public class Or extends OperatorSymbol {

    public Or(Object a, Object b) {
        super(a, b);
    }

    @Override
    public boolean getResult() {

        if (a instanceof OperatorSymbol && b instanceof OperatorSymbol) {
            OperatorSymbol aa =  (OperatorSymbol) a;
            OperatorSymbol bb =  (OperatorSymbol) b;

            boolean aResult = aa.getResult();
            boolean bResult = bb.getResult();
            return aResult || bResult;
        } else if (a instanceof OperatorSymbol){
            OperatorSymbol aa =  (OperatorSymbol) a;
            boolean aResult = aa.getResult();

            return aResult || (Boolean) b;
        } else if (a instanceof OperatorSymbol){
            OperatorSymbol bb =  (OperatorSymbol) b;
            boolean aResult = bb.getResult();

            return aResult || (Boolean) a;
        } else {
            return (Boolean)a || (Boolean) b;
        }
    }
}
