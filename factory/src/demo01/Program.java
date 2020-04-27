package demo01;

import java.util.Scanner;

/**
 * @description:
 * @Date: 2020-04-27 10:33
 * @author: liufeng
 *
 * 需求：
 *      请用java面向对象的特性，实现一个简单计算器控制台程序，要求输入两个数和运算符号，得到结果
 *
 * 分析：
 *
 **/
public class Program {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第一个数:");
            double numA = sc.nextDouble();

            System.out.println("请输入运算符:");
            String opt = sc.next();

            System.out.println("请输入第二个数:");
            double numB = sc.nextDouble();
            String result = "";
            switch (opt){
                case "+" :
                    result = Double.toString(numA + numB);
                    break;
                case "-" :
                    result = Double.toString(numA - numB);
                    break;
                case "*" :
                    result = Double.toString(numA * numB);
                    break;
                case "/" :
                    if(numA != 0){
                        result = Double.toString(numA / numB);
                    }else{
                        result = "除数不能为0";
                    }
                    break;
            }
            System.out.println(result);
        }catch (Exception ex){
            System.out.println("您的输入有错："+ex.getLocalizedMessage());
        }
    }
}
