package Model;

import java.util.List;

import Controller.iGetModel;
/**
 * Отвечает за предоставление данных
 */
public class Model implements iGetModel {
    /**
     * Список студентов
     * @param students - студенты
     */
    private List<Student> students;
    /**
     * Конструктор
     * @param students - студенты
     */
    public Model(List<Student> students) {
        this.students = students;
    }

    /**
     * Возвращает список студентов
     */
    public List<Student> getAllStudent()
    {
        return students;
    }

    /** 
     * Добавление студента
     */
    @Override
    public void addStudentToRepo(Student student) {
        students.add(student);
    }

    /** удаление студента */
    @Override
    public void deleteStudent(long studentID) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentID() == studentID) {
                students.remove(i);
            }
        }
    }
}