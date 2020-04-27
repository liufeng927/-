package demo03;

/**
 * @description:
 * @Date: 2020-04-27 11:25
 * @author: liufeng
 *
 * 优化升级：
 *        简单工厂模式的实现：如果还有新的运算，只需要新加一个实现顶级接口即可
 **/
public class TestDemo {

    public static void main(String[] args) {
        OperationAdd add = new OperationAdd();
        double result1 = add.getResult(1, 3);
        System.out.println(result1);

        OperationSub sub = new OperationSub();
        double result2 = sub.getResult(4,9);
        System.out.println(result2);
    }
}
