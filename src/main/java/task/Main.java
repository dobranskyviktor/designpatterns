package task;

import java.lang.reflect.Proxy;

/**
 * Created by dobransk on 5/30/2017.
 */
public class Main
{
    public static void main(String[] args)
    {

        CalcService cs = (CalcService) Proxy.newProxyInstance(//
                Main.class.getClassLoader(), new Class[]
                {
                    CalcService.class
                }, new LogProxy(new CalcServiceImpl()));

        cs.hello("ahoj");
        cs.hello("beee");
    }
}
