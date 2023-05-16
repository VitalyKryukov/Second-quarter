package Controllers;

import StudentDomen.Teacher;
import StudentService.TeacherService;

public class TeacherController implements iUserController<Teacher>{

    private final TeacherService teacService = new TeacherService();
    
    @Override
    public void create(String firstName, String secondName, int age) {
        teacService.create(firstName, secondName, age);
    }
}