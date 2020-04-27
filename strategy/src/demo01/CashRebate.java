package demo01;

/**
 * @description:
 * @Date: 2020-04-27 13:42
 * @author: liufeng
 **/
public class CashRebate extends CashSuper {

    //折扣
    private double discount;

    public CashRebate(double discount){
        this.discount = discount;
    }

    @Override
    public double acceptCash(double money) {
        return money * discount;
    }
}
