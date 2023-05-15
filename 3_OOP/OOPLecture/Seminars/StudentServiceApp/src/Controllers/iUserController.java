package Controllers;

import StudentDomen.User;
/**
 * Интрефейс контролера
 */
public interface iUserController<T extends User> {
    /**
     * Создать (студента, учителя, работника, ...)
     * @param firstName - имя
     * @param secondName - фамилия
     * @param age - возраст
     */
    void create(String firstName, String secondName, int age);
}