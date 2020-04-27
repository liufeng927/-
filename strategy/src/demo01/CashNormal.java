package demo01;

/**
 * @description:
 * @Date: 2020-04-27 13:38
 * @author: liufeng
 **/
public class CashNormal extends CashSuper {

    @Override
    public double acceptCash(double money) {
        return money;
    }
}
