package task6b;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Scanner;

public class AuthProxy<T> implements InvocationHandler {
    private T service;

    private boolean authenticated;

    private void authenticate() {
        if(!authenticated) {
            System.out.print("Enter password: ");
            String line = new Scanner(System.in).nextLine();
            if (!"heslo".equals(line)) {
                throw new SecurityException("Wrong password");
            }
            authenticated = true;
        }
    }

    private AuthProxy(T service) {
        this.service = service;
    }

    public static <T> T createProxy(Class<T> interfc, T service) {
        return (T)Proxy.newProxyInstance(
                AuthProxy.class.getClassLoader(),
                new Class[]{interfc},
                new AuthProxy<T>(service)
        );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.isAnnotationPresent(RequiresAuth.class))
            authenticate();
        return method.invoke(service, args);
    }
}
