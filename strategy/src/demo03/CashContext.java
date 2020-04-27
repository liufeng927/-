package demo03;

import demo03.CashSuper;

/**
 * @description:
 * @Date: 2020-04-27 14:38
 * @author: liufeng
 **/
public class CashContext {

    CashSuper cs = null;

    public CashContext(String type){
        switch (type){
            case "正常收费":
                cs = new CashNormal();
                break;
            case "打折":
                cs = new CashRebate(0.8);
                break;
            case "满减":
                cs = new CashReturn(300,100);
                break;
        }

    }

    public double getResult(double money){
        return cs.acceptCash(money);
    }
}
