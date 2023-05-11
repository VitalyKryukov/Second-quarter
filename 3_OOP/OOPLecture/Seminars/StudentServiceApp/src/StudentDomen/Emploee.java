package StudentDomen;

public class Emploee extends User {
    /**
     * @param empId - ID работника
     */
    private int empId;
    /**
     * Конструктор
     * @param firstName - имя
     * @param secondName - фамилия
     * @param age - возраст
     * @param empId - ID работника
     */
    public Emploee(String firstName, String secondName, int age, int empId) {
        super(firstName, secondName, age);
        this.empId = empId;
    }
    /**
     * Получить ID работника
     * @return ID работника
     */
    public int getEmpId() {
        return empId;
    }
    /**
     * Задать ID работника
     * @param empId - ID работника
     */
    public void setEmpId(int empId) {
        this.empId = empId;
    }
}