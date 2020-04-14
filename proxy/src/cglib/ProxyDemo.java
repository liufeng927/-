package cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description:
 * @Date: 2020-04-10 11:30
 * @author: liufeng
 **/
public class ProxyDemo {

    static class Car{

        public void running(){
            System.out.println("The Car is running");
        }
    }

    /**
     * CGLib代理类
     */
    static class CGLibProxy implements MethodInterceptor{

        //代理对象
        private Object target;

        public Object getInstance(Object target){
            this.target = target;
            Enhancer e = new Enhancer();
            //设置父类为实例
            e.setSuperclass(this.target.getClass());
            //回调方法
            e.setCallback(this);
            //创建代理对象
            return e.create();
        }

        /**
         *
         * @param o 代理对象
         * @param method 代理方法
         * @param objects
         * @param methodProxy
         * @return
         * @throws Throwable
         */
        @Override
        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            //方法调用前的业务
            pre();
            Object result = methodProxy.invokeSuper(o, objects);
            after();
            return result;
        }

        private static void after() {

            System.out.println("停车后注意手刹！");
        }

        public static void pre(){
            System.out.println("启动前请打左转向灯");
        }
    }

    public static void main(String[] args) {
        //创建CGLib代理类
        CGLibProxy proxy = new CGLibProxy();
        //初始化代理对象
        Car car = (Car)proxy.getInstance(new Car());
        //执行方法
        car.running();
    }

}
