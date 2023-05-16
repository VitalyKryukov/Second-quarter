package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Teacher;
import StudentDomen.UserComparator;
/**
 * Распределение преподавателей
 */
public class TeacherService implements iUserService<Teacher>{
    /**
     * @param count - сквозной номер преподавателей
     */
    private int count;
    /**
     * @param teachers - список преподавателей
     */
    private List<Teacher> teachers;
    /**
     * Конструктор
     */
    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    /** @return вывод всех учителей */
    @Override
    public List<Teacher> getAll(){
        return teachers;
    }
    /**
    * @param count - ID учителя
    */
    @Override
    public void create(String firstName, String secondName, int age) {
        Teacher person = new Teacher(firstName, secondName, age, count, secondName);
        count ++;
        teachers.add(person);    
    }

    /**
     * @param numberGroup - номер группы 
     * @return - возвращает отсортированный список учителей
     */
    public List<Teacher> getSortedByFIOTeacher(){
        List<Teacher> tchr = new ArrayList<>(teachers);
        tchr.sort(new UserComparator<Teacher>()); //сортировка с использованием класса UserComporator
        return tchr;
    }

}
