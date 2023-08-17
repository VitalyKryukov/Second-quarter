package Seminar3;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class DataSaver {
    public static void saveHumanData(Person person) {

        String fileName = person.getLastName();
        String fileContents = person.toString();

        // Проверка, существует ли файл с именем в виде данной фамилии
        File file = new File(fileName+".txt");

        try (FileWriter fw = new FileWriter(fileName+".txt", file.exists())) { // Если файл существует, дозаписываем
            fw.write(fileContents+"\n");
            fw.flush();
        }
        catch(IOException e) {
            System.out.println(String.format("Ошибка сохранения в файл <%s> содержимого <%s>", fileName, fileContents));
        }
    }
}
