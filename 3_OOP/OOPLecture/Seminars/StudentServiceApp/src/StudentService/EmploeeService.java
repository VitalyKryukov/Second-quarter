package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Emploee;
import StudentDomen.UserComparator;
/**
 * Распределение работников
 */
public class EmploeeService implements iUserService<Emploee> {
    /**
     * @param count - сквозной номер работников
     */
    private int count;
    /**
     * @param students - список работников
     */
    private List<Emploee> emploees;
    /**
     * Конструктор
     */
    public EmploeeService() {
        this.emploees = new ArrayList<Emploee>();
    }
    /**
    * @param count - ID работника
    */
    @Override
    public void create(String firstName, String secondName, int age) {
       Emploee per = new Emploee(firstName, secondName, age, count);
       count++;
       emploees.add(per);
    }
    /**
     * Получение всех студентов
     */
    @Override
    public List<Emploee> getAll()
    {
        return emploees;
    }
    /**
     * Сортировка работников
     * @param numberEmploe - номер работника
     * @return
     */
    public List<Emploee> getSortedByFIOStudentGroup(int numberEmploe)
    {
        List<Emploee> emps = new ArrayList<>(emploees);
        emps.sort(new UserComparator<Emploee>());
        return emps;
    }
}
