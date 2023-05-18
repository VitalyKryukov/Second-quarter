package StudentDomen;

import java.util.List;

/**
 * Класс используемый для подсчёта среднего возроста
 */
public class AverageAge<T extends User> {
    /**
     * Список пользователй 
     */
    private List<T> users;

    /**
     * Конструктор
     */
    public AverageAge(List<T> users) {
        this.users = users;
    }

    /**
     * Метод определения среднего возраста
     */
    public Double averAge() {
        
        int sum = 0;
        for (T user : users)
            sum += user.getAge();

        return (double) (sum / users.size());
    }
}