package Controller;

import java.util.List;
import Model.Student;

/** 
 * Интерфейс для всех любых model (архитектурная граница) 
 */
public interface iGetModel {
    /**
     * Возвращает список студентов
     * @return
     */
    public List<Student> getAllStudent();
    /**
     * Добавить студента
     * @param student
     */
    void addStudentToRepo(Student student);
    /**
     * Удалить студента по ID
     * @param studentID - ID студента
     */
    void deleteStudent(long studentID); 
}