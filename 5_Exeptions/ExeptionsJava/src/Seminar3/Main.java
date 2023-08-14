package Seminar3;

public class Main {
    public static void main(String[] args) {

        System.out.println("Укажите следующие данные, разделённые пробелом:");
        System.out.println("Фамилия Имя Отчество дата рождения номер телефона пол");

        // Вводим бесконечный цикл, чтобы пользователь мог вводить свои данные вновь и вновь в случае неуспешной валидации введённых данных
        while (true) {
            try {
                // Создаём экземпляр пользователя
                Human human = new Human();
                // Через консоль принимаем данные, проверяем и наполняем ими нашего пользователя
                DataReceptor.getHumanData(human);
                // Сохраняем в файл
                DataSaver.saveHumanData(human);

                System.out.println("Данные успешно сохранены.");
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
