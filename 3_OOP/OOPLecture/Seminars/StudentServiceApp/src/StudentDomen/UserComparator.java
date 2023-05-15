package StudentDomen;

import java.util.Comparator;
/**
 * Универсальный корпоратор сравнения типов.
 * Comparator - <T> - упрощение кода, переиспользование.
 * UserComparator - <T extends User> - безопасность типов.
 */
public class UserComparator<T extends User> implements Comparator<T> {
    /**
     * Переопределенный метод сравнения типов User
     */
    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
            return resultOfComparing;
        } else {
            return resultOfComparing;
        }
    }

}