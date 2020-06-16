package helloworld.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy implements InvocationHandler {

    private Object obj;

    public JDKProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object result = method.invoke(obj, args);
        System.out.println("after");
        return result;
    }

    public static void main(String[] args) {
        PersonDao proxy = (PersonDao) Proxy.newProxyInstance(
                PersonDao.class.getClassLoader(),
                new Class[]{PersonDao.class},
                new JDKProxy(new PersonDaoImpl()));
        proxy.say("hello, world");
    }
}
