package StudentDomen;

public class Teacher extends User {
    /**
     * @param tiacherID - ID учителя
     */
    private int teacherId;
    /**
     * @param academicDegree - ученая степень
     */
    private String academicDegree;
    /**
     * Конструктор
     * @param firstName - имя
     * @param secondName - фамилия
     * @param age - возраст
     * @param tiacherID - ID учителя
     * @param academicDegree - ученая степень
     */
    public Teacher(String firstName, String secondName, int age, int tiacherID, String academicDegree ) {
        super(firstName, secondName, age);
       this.teacherId = tiacherID;
       this.academicDegree = academicDegree;
    }
    
    /**
     * Получить ID учителя
     * @return ID учителя
     */
    public int getTeacherId() {
        return teacherId;
    }
    /**
     * Задать ID учителя
     * @param tiacherID - ID учителя
     */
    public void setTeacherId(int tiacherID) {
        this.teacherId = tiacherID;
    }
    /**
     * Получить степень учителя
     * @return степень учителя
     */
    public String getLevel() {
        return academicDegree;
    }
    /**
     * Задать степень учителя
     * @param academicDegree - степень учителя
     */
    public void setLevel(String academicDegree) {
        this.academicDegree = academicDegree;
    }
    /**
     * Переопределенный метод toString
     */
    @Override
    public String toString() {
        return "Teacher{"+
            "firstName=" +super.getFirstName()+", "+
            "secondName="+super.getSecondName()+", "+
            "age=" +super.getAge()+", "+
            "teacherId="+teacherId+
        "}";
    }
}
