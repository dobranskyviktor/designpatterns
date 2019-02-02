package task6b;

public class CalcServiceImpl implements CalcService {

    @Override
    public String hello() {
        return "hello";
    }

    @Override
    public int neg(int x) {
        return -x;
    }

    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public int mul(int x, int y) {
        return x * y;
    }
}
