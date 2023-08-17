package Seminar3;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите данные, разделённые пробелом:");
        System.out.println("Фамилия Имя Отчество дата рождения номер телефона пол");

        // Бесконечный цикл, чтобы пользователь мог вводить свои данные вновь и вновь
        while (true) {
            try {
                // Создаём экземпляр пользователя
                Person person = new Person();
                // Через консоль принимаем данные, проверяем и наполняем ими нашего пользователя
                DataReceptor.getHumanData(person);
                // Сохраняем в файл
                DataSaver.saveHumanData(person);

                System.out.println("Данные сохранены успешно.");
                // Выходим из бесконечного цикла
                break;
            } catch (RuntimeException e) {
                // DataReceptor.getHumanData при проблеме с валидацией данных выбрасывает исключение, которое выводим здесь
                System.err.println(e.getMessage());
                System.out.println("Укажите данные заново:");
            }
        }
    }
}
