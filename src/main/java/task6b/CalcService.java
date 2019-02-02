package task6b;

/**
 * Created by jaros_000 on 30.5.2017.
 */
@Log
public interface CalcService {
    String hello();

    @Log
    int neg(int x);

    @RequiresAuth
    int add(int x, int y);

    @RequiresAuth
    int mul(int x, int y);
}
