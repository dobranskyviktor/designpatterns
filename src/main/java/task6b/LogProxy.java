package task6b;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class LogProxy<T> implements InvocationHandler {
    private T service;

    private void logCall(String name, Object... params) {
        System.out.printf("Method-call %s with params %s \n", name,
                Arrays.toString(params));
    }

    private void logReturn(String name, Object value, Object... params) {
        System.out.printf("Method-return %s with params %s returns %s\n", name,
                Arrays.toString(params), value);
    }

    private void logException(String name, Exception exception, Object... params) {
        System.out.printf("Method-return %s with params %s with exception %s\n", name,
                Arrays.toString(params), exception.getMessage());
    }

    private LogProxy(T service) {
        this.service = service;
    }

    public static <T> T createProxy(Class<T> interfc, T service) {
        return (T)Proxy.newProxyInstance(
                LogProxy.class.getClassLoader(),
                new Class[]{interfc},
                new LogProxy<T>(service)
        );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.isAnnotationPresent(Log.class) || method.getDeclaringClass().isAnnotationPresent(Log.class)) {
            try {
                logCall(method.getName(), args);
                Object value = method.invoke(service, args);
                logReturn(method.getName(), value, args);
                return value;
            } catch (Exception e) {
                logException(method.getName(), e, args);
                throw e;
            }
        } else {
            return method.invoke(service, args);
        }
    }
}
