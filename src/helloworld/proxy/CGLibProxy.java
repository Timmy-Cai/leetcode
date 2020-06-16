package helloworld.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

// https://mvnrepository.com/artifact/cglib/cglib/2.2
// https://mvnrepository.com/artifact/asm/asm/3.3.1
public class CGLibProxy implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("before");
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("after");
        return result;
    }

    public static void main(String[] args) {
        Enhancer eh = new Enhancer();
        eh.setSuperclass(PersonDaoImpl.class);
        eh.setCallback(new CGLibProxy());
        PersonDaoImpl personDao = (PersonDaoImpl) eh.create();
        personDao.say("hello, world");
    }
}
