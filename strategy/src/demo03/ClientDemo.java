package demo03;

/**
 * @description:
 * @Date: 2020-04-27 15:03
 * @author: liufeng
 *
 * 分析：
 *      工厂模式和策略模式的结合使用
 * 优点：
 *      对客户端只暴露一个CashContext类，松耦合。
 * 缺点：
 *      如果业务改动，新增新的活动，或者修改以前活动的内容就需要改动以前的代码。
 **/
public class ClientDemo {
    public static void main(String[] args) {
        CashContext cashContext1 = new CashContext("正常收费");
        double result1 = cashContext1.getResult(600);
        System.out.println(result1);

        CashContext cashContext2 = new CashContext("打折");
        double result2 = cashContext2.getResult(900);
        System.out.println(result2);

        CashContext cashContext3 = new CashContext("满减");
        double result3 = cashContext3.getResult(1000);
        System.out.println(result3);
    }
}
