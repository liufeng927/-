package jdkproxy; /**
 * @description:
 * @Date: 2020-04-10 10:36
 * @author: liufeng
 **/


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理：JDKProxy 和CGLib
 *      1.JDKProxy是java语言自带的功能，无需通过加载第三类实例
 *      2.JDKProxy是通过拦截器加反射的方式实现的
 *      3.JDKProxy只能代理继承接口的类
 *      4.JDKProxy实现和调用起来比较简单
 *      5.CGLib是第三方提供的工具，基于ASM（一个字节码操作框架）实现的，性能比较高
 *      6.CGLib无需通过接口来实现，它是通过实现子类的方式来完成的。
 *
 * JDKProxy实现原理  核心》 InvocationHandler接口（简称代理器）
 *
 * CGLib实现原理   核心 MethodInterceptor接口
 *      CGLib在初始化被代理类时，是通过Enhancer对象把代理对象设置为被代理类的子类来实现动态代理的。
 *      因此被代理类不能被关键字final修饰.
 */
public class ProxyDemo {

    static interface Car {
        void running();
    }

    static class Bus implements Car{

        @Override
        public void running() {
            System.out.println("The Bus is running.");
        }
    }

    static class Taxi implements Car{

        @Override
        public void running() {
            System.out.println("The Taxi is running.");
        }
    }

    static class JDKProxy implements InvocationHandler{

        private Object target;//代理对象

        //获取代理对象
        public Object getInstance(Object target){
            this.target = target;
            return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
        }

        /**
         * 执行代理的方法
         * @param proxy 代理对象
         * @param method 代理方法
         * @param args 方法的参数
         * @return
         * @throws Throwable
         */
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            //动态代理之前的业务处理
            pre();
            Object result = method.invoke(target, args);
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
        // 执行JDKProxy
        JDKProxy jdkProxy = new JDKProxy();
        Car carInstance = (Car)jdkProxy.getInstance(new Taxi());
        carInstance.running();
    }
}
