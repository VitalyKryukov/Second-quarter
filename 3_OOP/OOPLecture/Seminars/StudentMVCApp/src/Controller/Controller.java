package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.jws.WebParam.Mode;

import Model.Student;
import Model.Model;
import View.View;

/**
 * Класс взаимодействия с Model и View 
 */
public class Controller {
    /**
     * Список студентов
     * @param students - студенты
     */
    private List<Student> students; 
    // В контроллере хранятся ссылки на view/model
    /**
     * Ссылка на view через интерфейс iGetView
     */
    private iGetView view;
    /**
     * Ссылка на model через интерфейс iGetModel
     */
    private iGetModel model;

    /**
     * Контроллер
     * @param view - доступ к view через интерфейс iGetView
     * @param model - доступ к model через интерфейс iGetModel
     */
    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    } 
    /**
     * Получение списка студентов внутрь контроллера 
     * (создается для разрыва связи между view и model).
     */
    public void getAllStudent()
    {
        students = model.getAllStudent();
    }
    /**
     * Проверка наличия в списке студентов
     * @return true, если в списке есть студент(ы)
     */
    public boolean testData()
    {
        if(students.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    /**
     * Связь между View и Model
     */
    public void updateView()
    {
        //MVP
        getAllStudent();
        if(testData())
        {
            view.printAllStudent(students);
        }
        else{
            System.out.println("Список студентов пуст!");
        }
        //MVC - получает model и передает ее view
        //view.printAllStudent(model.getAllStudent());
    }

    /**
     * главный цикл
     */
    public void run()
    {
        Commands com = Commands.NONE;//.NONE - ничего не делать
        boolean getNewIteration = true;//бесконечная итерация
        while(getNewIteration)
        {
            System.out.println("**********************");
            System.out.println("Список команд: LIST, CREATE, DELETE, EXIT");

            String command = view.prompt("Введите команду: ");
            com = Commands.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                    getNewIteration=false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    getAllStudent();
                    updateView();
                    break;
                case DELETE:
                    System.out.println("Введите ID студента для удаления: ");
                    Scanner num = new Scanner(System.in);
                    Long studentId = num.nextLong();
                    model.deleteStudent(studentId);
                    break;
                case CREATE:
                    Scanner stud = new Scanner(System.in);
                    System.out.println("Введите имя студента: ");
                    String firstName = stud.next();
                    System.out.println("Введите фамилию студента: ");
                    String secondName = stud.next();
                    System.out.println("Введите возраст студента: ");
                    int age = Integer.parseInt(stud.next());
                    System.out.println("Введите ID студента: ");
                    long ID = Long.parseLong(stud.next());
                    Student newStudent = new Student(firstName, secondName, age, ID);
                    model.addStudentToRepo(newStudent);
                    break;
            }
        }
    }
}