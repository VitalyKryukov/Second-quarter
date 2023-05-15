package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;
/**
 * Распределение студентов
 */
public class StudentService implements iUserService<Student> {
    /**
     * @param count - сквозной номер студентов
     */
    private int count;
    /**
     * @param students - список студентов
     */
    private List<Student> students;
    /**
     * Конструктор
     */
    public StudentService() {
        this.students = new ArrayList<Student>();
    }
   /**
    * @param count - ID студента
    */
    @Override
    public void create(String firstName, String secondName, int age) {
       Student per = new Student(firstName, secondName, age, count);
       count++;  
       students.add(per);      
    }
    
    @Override
    public List<Student> getAll() {
        return students;
    }   

    // public List<Student> getAll()
    // {
    //     return students;
    // }


}
