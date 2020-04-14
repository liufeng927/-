/**
 * @description:
 * @Date: 2020-04-14 14:53
 * @author: liufeng
 **/

/**
 * 懒汉式
 *      线程安全，调用效率不高，能延迟加载
 *
 */
public class SingleDemo02 {

    private static SingleDemo02 instance = null ;

    private SingleDemo02(){

    }

    public synchronized SingleDemo02 getInstance(){
        if(instance == null){
            return instance = new SingleDemo02();
        }
        return instance;
    }
}
