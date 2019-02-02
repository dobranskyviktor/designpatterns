package task6b;

/**
 * Created by jaros_000 on 30.5.2017.
 */
public class Main {
    public static void main(String[] args) {
        CalcService calc = new CalcServiceImpl();
//        //CalcService calc = new CalcServiceLog(new CalcServiceImpl());
//        //CalcService calc = new CalcServiceAuth(new CalcServiceImpl());
//        //CalcService calc = new CalcServiceAuth(new CalcServiceLog(new CalcServiceImpl()));
////        CalcService calc = new CalcServiceLog(new CalcServiceAuth(new CalcServiceImpl()));
//
//        calc = LogProxy.createProxy(CalcService.class, calc);
//        calc = AuthProxy.createProxy(CalcService.class, calc);
//
//        calc.hello();
//        calc.neg(4);
//        calc.add(1, 2);
//        calc.mul(3, 4);

        StudentService studentService = new StudentServiceImpl();
        studentService = LogProxy.createProxy(StudentService.class, studentService);
        studentService = AuthProxy.createProxy(StudentService.class, studentService);
        studentService.add(new Student());
        studentService.remove(new Student());
        studentService.contains(null);
        studentService.size();
    }
}
