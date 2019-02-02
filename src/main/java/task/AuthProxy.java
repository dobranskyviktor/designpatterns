package task;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by dobransk on 5/30/2017.
 */
public class AuthProxy implements InvocationHandler
{
    private final Object delegate;
    private static final String password = "ahoj";
    private static boolean alreadyAuthentificated = false;

    public AuthProxy(Object delegate)
    {
        this.delegate = delegate;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        if (alreadyAuthentificated == false)
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Password:");
            String s = br.readLine();
            if (!"ahoj".equals(s))
            {
                System.out.println("Wrong password!!!!");
                return null;
            }
            alreadyAuthentificated = true;
        }
        return method.invoke(delegate, args);
    }
}
