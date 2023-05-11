package StudentDomen;

import java.util.Iterator;
import java.util.List;
/**
 * Итератор коорый возвращает новое значение, или не возвращает в виду отсутствия необходимости
 */
public class StudentGroupIterator implements Iterator<Student> {
    /**
     * @param counter - счетчик
     */
    private int counter;
    /**
     * Список студентов по которым происходит итерация
     */
    private final List<Student> students;
    /**
     * Конструктор
     * @param students - студенты
     * @param counter - счетчик
     */
    public StudentGroupIterator(List<Student> students) {
        this.students = students;
        this.counter = 0;
    }
    /**
     * Проверка достижения счетчиком предела списка студентов
     */
    @Override
    public boolean hasNext() {
       return counter<students.size();
    }
    /**
     * Метод который вернет студента, если hasNext не достиг предела списка студентов
     */
    @Override
    public Student next() {
        if(!hasNext())
        {
            return null;
        }
        return students.get(counter++);        
    }
    
}
