package task6b;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * Created by jaros_000 on 30.5.2017.
 */
public class ProxyTest {
    public static void main(String[] args) {
        Object o = Proxy.newProxyInstance(
                ProxyTest.class.getClassLoader(),
                new Class[]{CalcService.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("Method call " + method.getName() + " with args " + Arrays.toString(args));
                        return null;
                    }
                }
        );

        System.out.println(o.getClass());
        System.out.println(o instanceof CalcService);
        CalcService calcService = (CalcService)o;
        int x = calcService.add(1, 2);
    }
}
