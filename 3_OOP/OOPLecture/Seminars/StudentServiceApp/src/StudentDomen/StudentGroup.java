package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    /**
     * @param groupID - ID группы
     */
    public final int groupID;
    /**
     * Список студентов
     */
    private List<Student> students;
    /**
     * Конструктор
     * @param id - ID группы
     * @param students - студенты
     */
    public StudentGroup(int id, List<Student> students) {
        this.groupID = id;
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
    /**
     * Переопределенный метод
     */
    @Override
    public String toString() {
        String studentList = "\tStudent list: {\n";
        for (Student student : students) {
            studentList += "\t\t" + student + "\n";
        }
        studentList += "\t}";

        return "\tGroup ("
                + "ID = " + groupID
                + ", Student count = " + students.size() + ")\n"
                + studentList;
    }

    @Override
    public int compareTo(StudentGroup o) {
        return o.students.size() - students.size();
    }
}