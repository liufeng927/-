/**
 * @description:
 * @Date: 2020-04-14 14:51
 * @author: liufeng
 **/

/**
 * 饿汉式
 *      线程安全，调用效率高，不能实现延迟加载
 * 缺点：
 *      如果只是加载本类，而不是要调用getInstance()，甚至永远没有调用，则会造成资源浪费！
 */
public class SingleDemo01 {

    private static final SingleDemo01 INSTANCE = new SingleDemo01();

    private SingleDemo01(){

    }

    public SingleDemo01 getInstance(){
        return INSTANCE;
    }
}
