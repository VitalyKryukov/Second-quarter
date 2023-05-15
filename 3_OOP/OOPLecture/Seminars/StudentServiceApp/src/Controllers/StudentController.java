package Controllers;

import StudentDomen.Student;
import StudentService.StudentGroupService;
import StudentService.StudentService;

public class StudentController implements iUserController<Student> {
    /**
     * Сервис студентов
     */
    private final StudentService dataService = new StudentService();
    /**
     * Сервис групп
     */
    private final StudentGroupService groupService = new StudentGroupService();
    
    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName, secondName, age);
    }


    
}