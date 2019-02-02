package task;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by dobransk on 5/30/2017.
 */
public class LogProxy implements InvocationHandler
{
    private final Object delegate;

    public LogProxy(Object delegate)
    {
        this.delegate = delegate;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        Object invoke = method.invoke(delegate, args);
        System.out.println("method: " + method + ", args: " + args + ", " + invoke);
        return invoke;
    }
}
