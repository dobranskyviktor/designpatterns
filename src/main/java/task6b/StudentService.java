package task6b;

/**
 * Created by jaros_000 on 6.6.2017.
 */
@Log
public interface StudentService {
    void add(Student student);

    @RequiresAuth
    void remove(Student student);

    boolean contains(Student student);

    int size();
}
