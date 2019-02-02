package task6b;

import java.util.Arrays;

/**
 * Created by jaros_000 on 30.5.2017.
 */
public class CalcServiceLog implements CalcService
{
    private final CalcService calcService;

    public CalcServiceLog(CalcService calcService)
    {
        this.calcService = calcService;
    }

    private void logCall(String name, Object... params)
    {
        System.out.printf("Method-call %s with params %s \n", name, Arrays.toString(params));
    }

    private void logReturn(String name, Object value, Object... params)
    {
        System.out.printf("Method-return %s with params %s returns %s\n", name, Arrays.toString(params), value);
    }

    private void logException(String name, Exception exception, Object... params)
    {
        System.out.printf("Method-return %s with params %s with exception %s\n", name, Arrays.toString(params), exception.getMessage());
    }

    @Override
    public String hello()
    {
        return calcService.hello();
    }

    @Override
    public int neg(int x)
    {
        try
        {
            logCall("neg", x);
            int value = calcService.neg(x);
            logReturn("neg", value, x);
            return value;
        }
        catch (Exception e)
        {
            logException("neg", e, x);
            throw e;
        }
    }

    @Override
    public int add(int x, int y)
    {
        try
        {
            logCall("add", x, y);
            int value = calcService.add(x, y);
            logReturn("add", value, x, y);
            return value;
        }
        catch (Exception e)
        {
            logException("add", e, x, y);
            throw e;
        }
    }

    @Override
    public int mul(int x, int y)
    {
        try
        {
            logCall("mul", x, y);
            int value = calcService.mul(x, y);
            logReturn("mul", value, x, y);
            return value;
        }
        catch (Exception e)
        {
            logException("mul", e, x, y);
            throw e;
        }
    }
}
