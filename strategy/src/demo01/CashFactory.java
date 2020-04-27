package demo01;

/**
 * @description:
 * @Date: 2020-04-27 13:52
 * @author: liufeng
 **/
public class CashFactory {

    public static CashSuper createCashAccept(String type) {
        CashSuper cs = null;
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
        return cs;
    }
}
