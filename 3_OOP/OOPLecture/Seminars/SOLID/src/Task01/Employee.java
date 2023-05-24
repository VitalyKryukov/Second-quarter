package Task01;

import java.util.Date;

public class Employee {
    /**
     * @param name - Имя работника
     */
    private String name;
    /**
     * @param dob - 
     */
    private Date dob;
    /**
     * Конструктор
     * @param name - имя работника
     * @param dob - 
     */
    public Employee(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }
    
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
}