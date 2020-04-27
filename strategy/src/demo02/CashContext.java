package demo02;

/**
 * @description:
 * @Date: 2020-04-27 14:38
 * @author: liufeng
 **/
public class CashContext {

    private CashSuper cs;

    public CashContext(CashSuper cs){
        this.cs = cs;
    }

    public double getResult(double money){
        return cs.acceptCash(money);
    }
}
