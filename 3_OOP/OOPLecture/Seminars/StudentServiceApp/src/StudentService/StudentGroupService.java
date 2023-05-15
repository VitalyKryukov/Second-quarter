package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.UserComparator;
/**
 * Распределение групп
 */
public class StudentGroupService {
    /**
     * @param groups - список групп
     */
    private List<StudentGroup> groups;
    /**
     * Конструктор
     */
    public StudentGroupService() {
        this.groups = new ArrayList<>();
    }
    /**
     * Получение списка групп
     * @return список групп
     */
    public List<StudentGroup> getAll()
    {
        return this.groups;
    }
    /**
     * Сортировка студентов
     * @param numberGroup - номер группы
     * @return
     */
    public List<Student> getSortedByFIOStudentGroup(int numberGroup)
    {
        List<Student> students = new ArrayList<>(groups.get(numberGroup).getStudents());
        students.sort(new UserComparator<Student>());
        return students;
    }
}