package StudentDomen;

public class Student extends User implements Comparable<Student>{
    /**
     * @param studentID - ID студента
     */
    private long studentID;
    /**
     * Конструктор
     * @param firstName - имя
     * @param secondName - фамилия
     * @param age - возраст
     * @param studentID - ID студента
     */
    public Student(String firstName, String secondName, int age, long studentID) {
        super(firstName, secondName, age);
        this.studentID = studentID;
    }
    /**
     * Получить ID студента
     * @return ID студента
     */
    public long getStudentID() {
        return studentID;
    }
    /**
     * Задать ID студента
     * @param studentID - ID студента
     */
    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }
    /**
     * Переопределенный метод toString() для корректного вывода
     */
    @Override
    public String toString() {
        return "Student{" 
                
                +"firstName=" +super.getFirstName()
                +", secondName=" +super.getSecondName()
                +", age=" +super.getAge()+
                ", studentID=" + studentID +
                '}';
    }
    /**
     * Метод сортировки студентов
     */
    @Override
    public int compareTo(Student o) {
        
        System.out.println(super.getFirstName()+" - "+o.getFirstName());
         if(super.getAge()==o.getAge())
         {
            if(this.studentID==o.studentID)
            {
                return 0;
            }
            if(this.studentID<o.studentID)
            {
                return -1;
            }
            return 1;
         } 
         if(super.getAge()<o.getAge())
         {
            return -1;
         }   
         return 1;
    }
}
