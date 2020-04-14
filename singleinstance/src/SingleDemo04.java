/**
 * @description:
 * @Date: 2020-04-14 15:01
 * @author: liufeng
 **/

/**
 * 静态内部类实现
 */
public class SingleDemo04 {

    //静态内部类
    public static class SingletonClassInstance {
        //声明外部类型的静态常量
        public static final SingleDemo04 INSTANCE = new SingleDemo04();
    }

    private SingleDemo04(){

    }

    //对外提供唯一获取实例的方法
    public static SingleDemo04 getInstance(){
        return SingletonClassInstance.INSTANCE;
    }

}
