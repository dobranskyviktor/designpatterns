package task6b;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by jaros_000 on 30.5.2017.
 */
public class CalcServiceAuth implements CalcService {
    private final CalcService calcService;

    private boolean authenticated;

    public CalcServiceAuth(CalcService calcService) {
        this.calcService = calcService;
    }

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

    @Override
    public String hello() {
        return calcService.hello();
    }

    @Override
    public int neg(int x) {
        authenticate();
        return calcService.neg(x);
    }

    @Override
    public int add(int x, int y) {
        authenticate();
        return calcService.add(x, y);
    }

    @Override
    public int mul(int x, int y) {
        authenticate();
        return calcService.mul(x, y);
    }
}
