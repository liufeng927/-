package demo02;

import java.util.Scanner;

/**
 * @description:
 * @Date: 2020-04-27 11:03
 * @author: liufeng
 *
 * 优化点：
 *        业务和操作界面分开
 **/
public class Operation {

    public static double getResult(double doubleA,double doubleB,String opt){
        double result = 0.0;
        switch (opt) {
            case "+":
                result = doubleA + doubleB;
                break;
            case "-":
                result = doubleA - doubleB;
                break;
            case "*":
                result = doubleA * doubleB;
                break;
            case "/":
                if (doubleB != 0)
                result = doubleA / doubleB;
                break;
        }

        return result;
    }

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第一个数:");
            double numA = sc.nextDouble();

            System.out.println("请输入运算符:");
            String opt = sc.next();

            System.out.println("请输入第二个数:");
            double numB = sc.nextDouble();

            double result = getResult(numA, numB, "+");
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("你的输入有误："+e.getMessage());
        }

    }

}
