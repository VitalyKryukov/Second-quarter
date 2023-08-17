package s3;

import java.util.Map;
import java.util.HashMap;

public class UserData {
    private String lastName;
    private String firstName;
    private String patronymic;
    private String birthDate;
    private String phoneNumber;
    private char gender;

    public UserData(String input) throws UserDataException {
        String[] userData = input.split(" ");
        if (userData.length != 6) {
            throw new UserDataException("Неверное количество данных");
        }

        Map<String, String> userDataMap = new HashMap<>();
        for (String data : userData) {
            String[] keyValue = data.split(":");
            if (keyValue.length != 2) {
                throw new UserDataException("Неверный формат данных: " + data);
            }
            userDataMap.put(keyValue[0], keyValue[1]);
        }

        lastName = userDataMap.get("Фамилия");
        firstName = userDataMap.get("Имя");
        patronymic = userDataMap.get("Отчество");
        birthDate = userDataMap.get("датарождения");
        phoneNumber = userDataMap.get("номертелефона");
        gender = userDataMap.get("пол").charAt(0);

        if (!birthDate.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            throw new UserDataException("Неверный формат даты рождения: " + birthDate);
        }

        if (!phoneNumber.matches("\\d+")) {
            throw new UserDataException("Неверный формат номера телефона: " + phoneNumber);
        }

        if (gender != 'f' && gender != 'm') {
            throw new UserDataException("Неверный формат пола: " + gender);
        }
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return lastName + " " + firstName + " " + patronymic + " " + birthDate + " " + phoneNumber + " " + gender;
    }
}

