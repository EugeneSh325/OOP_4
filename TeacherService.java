
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherService implements iUserService<Teacher> {

    private List<Teacher> teachers;

    public TeacherService() {
        teachers = new ArrayList<>();
    }

    /* Методы, выполняющие добавление и получение пользователей
    * Метод getUsers() также использует обобщенный класс UserComparator длясортировки списка учителей.
    */


    @Override
    public void addUser(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public Teacher getUser(int index) {
        return teachers.get(index);
    }

    @Override
    public List<Teacher> getAllUsers() {
        return teachers;
    }

    @Override
    public void sortUsers(UserComparator<Teacher> comparator) {
        Collections.sort(teachers, comparator);
    }
}
