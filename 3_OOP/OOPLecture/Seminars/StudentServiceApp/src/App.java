import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentDomen.AverageAge;
import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;
import StudentDomen.Teacher;
import StudentService.EmploeeService;
import StudentService.StudentService;
import StudentService.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {
        
    //     StudentGroup group1 = new StudentGroup(1, Arrays.asList(
    //         new Student("Сергей", "Иванов", 22, (long) 101),
    //         new Student("Андрей", "Сидоров", 22, (long) 111),
    //         new Student("Иван", "Петров", 22, (long) 121),
    //         new Student("Игорь", "Иванов", 23, (long) 301),
    //         new Student("Даша", "Цветкова", 23, (long) 171),
    //         new Student("Лена", "Незабудкина", 23, (long) 104)
    // ));

    // StudentGroup group2 = new StudentGroup(2, Arrays.asList(
    //         new Student("Павел", "Иванов", 22, (long) 155),
    //         new Student("Владислав", "Гусев", 22, (long) 167)
    // ));

    // StudentGroup group3 = new StudentGroup(3, Arrays.asList(
    //         new Student("Дмитрий", "Лобанов", 22, (long) 102),
    //         new Student("Павел", "Сидоров", 22, (long) 103),
    //         new Student("Антон", "Уткин", 22, (long) 115)
    // ));

    // StudentSteam steam = new StudentSteam(1, Arrays.asList(group2, group3, group1));

    // System.out.println(steam);
        
        // User u1 = new User("Сергей","Иванов",25);
        // Student s1 = new Student("Сергей", "Иванов", 22, (long)101);
        // Student s2 = new Student("Андрей", "Сидоров", 22, (long)111);
        // Student s3 = new Student("Иван", "Петров", 22, (long)121);
        // Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
        // Student s5 = new Student("Даша", "Цветкова", 23, (long)171);
        // Student s6 = new Student("Лена", "Незабудкина", 23, (long)104);

        // List<Student> listStud = new ArrayList<Student>();
        // listStud.add(s1);
        // listStud.add(s2);
        // listStud.add(s3);
        // listStud.add(s4);
        // listStud.add(s5);
        // listStud.add(s6);

        // StudentGroup group = new StudentGroup(listStud);

        // for(Student stud : group)
        // {
        //     System.out.println(stud);
        // }

        // System.out.println("============= после сортировки =============");
        // Collections.sort(group.getStudents());


        // for(Student stud : group)
        // {
        //     System.out.println(stud);
        // }
        
        // Seminar 4
        // Emploee peron1 = new Emploee("Иванов", "Олег", 55, 110);
        // Student s1 = new Student("Сергей", "Иванов", 22, (long)101);

        // //EmploeeController contrEmp = new EmploeeController();
        // EmploeeController.paySalary(peron1);
        // // contrEmp.paySalary(s1);

        // Integer studHour[] = {124,234,231,1,45};
        // System.out.println(EmploeeController.mean(studHour));

        // Double emplSalary[] = {12555.23,34213.5,10000.0};
        // System.out.println(EmploeeController.mean(emplSalary));

        // Homework 4

        StudentService studen = new StudentService();
        // Передаём созданные данные студентов в класс StudentService
        studen.create("Ирина", "Краснова", 23);
        studen.create("Никита", "Пазгалёв", 20);
        studen.create("Валерия", "Ромашкина", 21);
        studen.create("Ирина", "Иванова", 23);
        studen.create("Даниил", "Букашкин", 19);
        studen.create("Петр", "Жуков", 22);
        // Выводим список студентов внутри сервиса
        System.out.println("Список студентов: \n" + studen.getAll());
        
        EmploeeService emploee = new EmploeeService();
        // Передаём созданные данные работников в класс EmploeeService
        emploee.create("Капиталина", "Георгиевна", 28);
        emploee.create("Семён", "Васильев",35);
        emploee.create("Алиса", "Попова", 27);
        emploee.create("Аслидин", "Иванов", 30);
        emploee.create("Дарья", "Бобкова", 45);
        emploee.create("Денис", "Сидоров", 54);
        System.out.println("Список работников: \n" + emploee.getAll());
        System.out.println("Отсортированный список работников:");
        System.out.println(emploee.getSortedByFIOStudentGroup(0));


        TeacherService teacher = new TeacherService();        
        // Передаём созданные данные преподавателей в класс TeacherService
        teacher.create("Виктория", "Кузнецова", 55);
        teacher.create("Вадим", "Шмельков", 46);
        teacher.create("Николай", "Лобанов", 30);
        teacher.create("Ксения", "Петросянова", 35);
        teacher.create("Екатерина", "Белова", 63);
        teacher.create("Анастасия", "Смирнова", 60);
        System.out.println("Список преподавателей: \n" + teacher.getAll());
        System.out.println("Отсортированный список учителей: \n" + teacher.getSortedByFIOTeacher());

        /* Средний возраст */
        AverageAge<Student> averAgeOfStudents = new AverageAge<Student>(studen.getAll());
        System.out.println("Средний возраст студентов: " + averAgeOfStudents.averAge());
        
        AverageAge<Teacher> averAgeOfTeachers = new AverageAge<Teacher>(teacher.getAll());
        System.out.println("Средний возраст преподавателей: " + averAgeOfTeachers.averAge());
        
        AverageAge<Emploee> averAgeOfEmploee = new AverageAge<Emploee>(emploee.getAll());
        System.out.println("Средний возраст работников: " + averAgeOfEmploee.averAge());
        
        
    }
}
