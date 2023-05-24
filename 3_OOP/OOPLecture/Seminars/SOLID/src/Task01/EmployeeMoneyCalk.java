package Task01;

public class EmployeeMoneyCalk {
    /**
     * @param baseSalary - базовая заработная плата
     */
    private int baseSalary;
    /**
     * Конструктор
     * @param baseSalary - базовая заработная плата
     */
    public EmployeeMoneyCalk(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    /**
     * Метод расчета базовой заработной платы
     * @return размер заработной платы
     */
    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25); //calculate in otherway
        return baseSalary - tax;
    }
}