package org.example.Seminar3.Task3;

/**
 * Задание 3.3
 * Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл.
 * Исключение должно отображать понятное для пользователя сообщение об ошибке.
 */

import java.io.IOException;

public class NonExistedFileException extends IOException {

    public NonExistedFileException() {
        super("Файла не существует.");
    }
}
