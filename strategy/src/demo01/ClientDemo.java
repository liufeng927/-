package demo01;

/**
 * @description:
 * @Date: 2020-04-27 13:57
 * @author: liufeng
 *  需求：
 *       做一个商场收银软件，营业员根据客户所购买商品的单价和数量，向客户收费，注意不定期的会有活动。
 *        活动内容如下：打八折，满减等。
 *
 *  分析：采用简单工厂模式实现。
 *
 *   不足：
 *      1.如果还有其他的商场活动，许需增加一个活动类实现CashSuper，还有就是需要增加CashFactory类中case种类。
 *      2.后端还是要改动以前写的代码。
 *      3.在这种情况，客户端需要认识两个类CashSuper和CashFactory。
 **/
public class ClientDemo {

    public static void main(String[] args) {
        CashSuper cashSuper = CashFactory.createCashAccept("正常收费");
        double acceptCash = cashSuper.acceptCash(300);
        System.out.println(acceptCash);

        CashSuper cashSuper1 = CashFactory.createCashAccept("打折");
        double acceptCash1 = cashSuper1.acceptCash(800);
        System.out.println(acceptCash1);

        CashSuper cashSuper2 = CashFactory.createCashAccept("满减");
        double acceptCash2 = cashSuper2.acceptCash(800);
        System.out.println(acceptCash2);

    }
}
