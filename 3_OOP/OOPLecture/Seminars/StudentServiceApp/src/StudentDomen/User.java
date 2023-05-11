package StudentDomen;

public class User {
    /**
     * @param firstName - Имя
     */
    private String firstName;
    /**
     * @param secondName - Фамилия
     */
    private String secondName;
    /**
     * @param age - возраст
     */
    private int age;
    /**
     * Конструктор
     * @param firstName - имя
     * @param secondName - фамилия
     * @param age - возраст
     */
    public User(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }
    /**
     * Получить имя
     * @return имя
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Задать имя
     * @param firstName - имя
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Получить фамилию
     * @return фамилия
     */
    public String getSecondName() {
        return secondName;
    }
    /**
     * Задать фамилию
     * @param secondName - фамилия
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    /**
     * Получить возраст
     * @return возраст
     */
    public int getAge() {
        return age;
    }
    /**
     * Задать возраст
     * @param age - возраст
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * Переопределенный метод toString() для корректного вывода
     */
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}
