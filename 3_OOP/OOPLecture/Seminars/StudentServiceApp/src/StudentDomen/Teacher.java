package StudentDomen;

public class Teacher extends User {
    /**
     * @param teacerId - ID учителя
     */
    private int teacerId;
    /**
     * @param academicDegree - ученая степень
     */
    private String academicDegree;
    /**
     * Конструктор
     * @param firstName - имя
     * @param secondName - фамилия
     * @param age - возраст
     * @param teacerId - ID учителя
     * @param academicDegree - ученая степень
     */
    public Teacher(String firstName, String secondName, int age, int teacerId, String academicDegree ) {
        super(firstName, secondName, age);
       this.teacerId = teacerId;
       this.academicDegree = academicDegree;
    }
    /**
     * Получить ID учителя
     * @return ID учителя
     */
    public int getTeacerId() {
        return teacerId;
    }
    /**
     * Задать ID учителя
     * @param teacerId - ID учителя
     */
    public void setTeacerId(int teacerId) {
        this.teacerId = teacerId;
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

}
