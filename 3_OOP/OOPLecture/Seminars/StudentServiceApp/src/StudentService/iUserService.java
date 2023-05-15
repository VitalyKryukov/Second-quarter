package StudentService;

import java.util.List;
/**
 * Интрефейс
 */
public interface iUserService<T> {
    /**
     * Получение (студентов, учителей, работников, ...)
     * @return
     */
    List<T> getAll();
    /**
     * Создать (студента, учителя, работника, ...)
     * @param firstName - имя
     * @param secondName - фамилия
     * @param age - возраст
     */
    void create(String firstName, String secondName, int age);
}
