package demo03;

/**
 * @description:
 * @Date: 2020-04-27 11:21
 * @author: liufeng
 **/
public class OperationAdd implements Operation {

    @Override
    public double getResult(double doubleA, double doubleB) {
        return doubleA + doubleB;
    }
}
