package task;

/**
 * Created by dobransk on 5/30/2017.
 */
public class CalcServiceImpl implements CalcService
{
    public int add(int a, int b)
    {
        return a + b;
    }

    public int neg(int a)
    {
        return -a;
    }

    public int mul(int a, int b)
    {
        return a * b;
    }

    public String hello(String hello)
    {
        return hello;
    }
}
