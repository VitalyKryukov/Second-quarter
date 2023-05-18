package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import Controller.iGetModel;
/**
 * Репозиторий
 */
public class FileRepo implements iGetModel {
    /**
     * Наименование файла
     * @param fileName - наименование файла
     */
    private String fileName;
    /**
     * Список студентов
     * @param students - студенты
     */
    private List<Student> students;
    /**
     * Конструктор
     * @param fileName - наименование файла
     */
    public FileRepo(String fileName) {
        this.fileName = fileName;
        this.students = new ArrayList<>();
        // Проверка на возможность получения доступа к файлу
        try(FileWriter fw = new FileWriter(fileName, true))
        {
            fw.flush();    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * Добавление студентов в хранилище
     * @param student - студент
     */
    public void addStudent(Student student)
    {
        this.students.add(student);
    }
    /**
     * Считать студентов
     */
    public void readAllStudentsFromFile()
    {
        try
        {
            File file = new File(fileName);// Взяли у операционной системы информацию о файле
            FileReader fr = new FileReader(file);//Просим разрешения на подкключение к файлу
            BufferedReader reader = new BufferedReader(fr);// Создаем BufferedReader чтобы считать FileReader (открываем соеинение с файлом)
            String line = reader.readLine();//Построчно считываем данный с файла
            while(line!=null)
            {
                String[] param = line.split(" ");//Разделение данных по пробелу
                Student pers = new Student(param[0], param[1], Integer.parseInt(param[2]), Long.parseLong(param[3]));//.parse - перевод в фомат строки
                students.add(pers);
                line = reader.readLine();//Считать следующую строку
            }

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    /**
     * Сохранить студентов
     */
    public void saveAllStudentToFile()
    {
        try(FileWriter fw = new FileWriter(fileName, true))
        {
            for(Student pers : students)
            {
                fw.write(pers.getFirstName()+" "+pers.getSecondName()+" "+pers.getAge()+" "+pers.getStudentID());
                fw.append('\n');
            }
            fw.flush();    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    @Override
    public List<Student> getAllStudent() {
        readAllStudentsFromFile();
        return students;
    }

    /** добавление студента и запись файла */
    @Override
    public void addStudentToRepo(Student student) {
        students.add(student);
        saveAllStudentToFile();
    }

    /** удаление студента и запись файла */
    @Override
    public void deleteStudent(long studentID) {
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getStudentID() == studentID) {
                    students.remove(i);
                    saveAllStudentToFile();
                }
            }
        }
    }