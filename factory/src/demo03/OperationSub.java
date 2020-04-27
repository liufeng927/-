package demo03;

/**
 * @description:
 * @Date: 2020-04-27 11:27
 * @author: liufeng
 **/
public class OperationSub implements Operation{
    @Override
    public double getResult(double doubleA, double doubleB) {
        return doubleA - doubleB;
    }
}
