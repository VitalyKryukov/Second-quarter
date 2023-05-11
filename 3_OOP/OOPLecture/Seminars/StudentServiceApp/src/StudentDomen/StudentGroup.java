package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    /**
     * Список студентов
     */
    private List<Student> students;
    /**
     * Конструктор
     * @param students - студенты
     */
    public StudentGroup(List<Student> students) {
        this.students = students;
    }
    /**
     * Получить список студентов
     * @return список студентов
     */
    public List<Student> getStudents() {
        return students;
    }
    /**
     * Задать список студентов
     * @param students - студенты
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    /**
     * Итератор
     */
    // @Override
    // public Iterator<Student> iterator() {
    //     return new StudentGroupIterator(students);
    // }

    /**
     * Итератор "анонимный" если не создавать экземпляр класса "StudentGroupIterator"
     */
    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>(){
            private int index = 0;
            @Override
            public boolean hasNext() {
               return index<students.size();
            }
            @Override
            public Student next() {
                if(!hasNext())
                {
                    return null;
                }
                return students.get(index++);        
            }

        };
    }
    
}