package demo01;

import java.lang.reflect.Member;

/**
 * @description:
 * @Date: 2020-04-27 13:44
 * @author: liufeng
 **/
public class CashReturn extends CashSuper {

    //返利的条件
    public double moneyCondiion;

    //返利的金额
    private double returnMoney;

    @Override
    public double acceptCash(double money) {
        if (money >= moneyCondiion){
            return money - Math.floor(money/moneyCondiion) * returnMoney;
        }else {
            return 0;
        }
    }

    public CashReturn(double moneyCondiion,double returnMoney){
        this.moneyCondiion = moneyCondiion;
        this.returnMoney = returnMoney;
    }
}
