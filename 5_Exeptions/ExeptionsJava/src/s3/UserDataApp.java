package s3;

import java.io.IOException;
import java.util.Scanner;

public class UserDataApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные в произвольном порядке, разделенные пробелом (например: Фамилия:Иванов Имя:Иван Отчество:Иванович датарождения:01.01.1990 номертелефона:1234567890 пол:m):");
        String input = scanner.nextLine();

        try {
            UserData userData = new UserData(input);
            UserDataFileWriter fileWriter = new UserDataFileWriter();
            fileWriter.writeUserData(userData);
            fileWriter.closeWriters();
            System.out.println("Данные успешно записаны в файл.");
        } catch (UserDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



