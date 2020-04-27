package demo02;

/**
 * @description:
 * @Date: 2020-04-27 14:41
 * @author: liufeng
 *  需求：
 *        做一个商场收银软件，营业员根据客户所购买商品的单价和数量，向客户收费，注意不定期的会有活动。
 *        活动内容如下：打八折，满减等。
 *
 *  分析：
 *      采用的是策略模式，商场的每一种活动，相当于一个策略，使用不同的策略，就返回不同的结果
 *
 *  优点：
 *      1. 如果出现业务变动，增加一个新的商场活动，不需要改变以前的代码，只需要重新再写一个策略即可。
 *      2. 如果修改以前的活动，可以不用改动源代码。
 *
 *  缺点：
 *      对客户端暴露两个类CashContext和CashNormal
 **/
public class ClientDemo {
    public static void main(String[] args) {
        CashContext cashContext1 = new CashContext(new CashNormal());
        double result1 = cashContext1.getResult(800);
        System.out.println(result1);

        CashContext cashContext2 = new CashContext(new CashRebate(0.8));
        double result2 = cashContext2.getResult(900);
        System.out.println(result2);

        CashContext cashContext3 = new CashContext(new CashReturn(400, 50));
        double result3 = cashContext3.getResult(900);
        System.out.println(result3);
    }
}
