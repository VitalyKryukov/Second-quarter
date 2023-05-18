package Controller;

import java.util.List;
import Model.Student;

/** 
 * Интерфейс для всех любых view (архитектурная граница) 
 */
public interface iGetView {
    /**
     * Метод отображения студентов
     * @param students - студенты
     */
    void printAllStudent(List<Student> students);
    /**
     * Вывод сообщения message и чтение строки из консоли
     */
    String prompt(String message);
}