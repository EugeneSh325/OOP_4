package gb;
public class TeacherController<T extends Teacher> implements iUserController<T> {

    private iUserService<T> userService;

    public TeacherController(iUserService<T> userService) {
        this.userService = userService;
    }

    @Override
    public void addUser(T user) {
        userService.addUser(user);
    }

    @Override
    public T getUser(int index) {
        return userService.getUser(index);
    }

    @Override
    public List<T> getAllUsers() {
        return userService.getAllUsers();
    }

    @Override
    public void sortUsers(UserComparator<T> comparator) {
        userService.sortUsers(comparator);
    }
}
