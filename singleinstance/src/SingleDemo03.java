/**
 * @description:
 * @Date: 2020-04-14 14:56
 * @author: liufeng
 **/

/**
 * 双重检锁式
 *      由于JVM底层内部模型原因，偶尔会出问题。不建议使用
 */
public class SingleDemo03 {

    private volatile static SingleDemo03 instance ;

    private SingleDemo03(){

    }

    public SingleDemo03 getInstance(){
        if (null == instance) {
            synchronized (SingleDemo03.class) {
                if (null == instance) {
                    instance = new SingleDemo03();
                }
            }
        }
        return instance;
    }
}
