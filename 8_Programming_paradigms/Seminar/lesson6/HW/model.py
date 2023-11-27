import time


class Model:
    """
    Модуль для работы с данными
    """

    def __init__(self):
        # Время, когда секундомер был запущен
        self.start_time = None

        # Общее количество прошедших секунд на секундомере
        self.time_difference = 0

        # Индикатор, указывающий, находится ли секундомер на паузе
        self.is_paused = False

    def start_pause(self) -> None:
        """
        Запуск или постановка на паузу секундомера
        """
        # Секундомер запускается впервые, фиксируем время старта
        if not self.start_time:
            self.time_difference = 0
            self.start_time = time.time()

        # Секундомер на паузе, снимаем с паузы
        elif self.is_paused:
            # Фиксируем время нового старта
            self.start_time = time.time()
            self.is_paused = False

        # Секундомер не на паузе, ставим на паузу
        else:
            # Фиксируем, сколько всего времени прошло с начального запуска секундомера,
            # прибавляя к прошлым периодам работы секундомера новый период
            self.time_difference += time.time() - self.start_time
            self.is_paused = True

    def stop(self) -> None:
        """
        Остановка секундомера
        """
        # Секундомер вообще запускался
        if self.start_time:

            # Секундомер не на паузе
            if not self.is_paused:
                # Фиксируем, сколько всего времени прошло с начального запуска секундомера,
                # прибавляя к прошлым периодам работы секундомера новый период
                self.time_difference += time.time() - self.start_time

            # Обнуляем переменные класса, кроме time_difference - она обнуляется при первом старте
            self.start_time = None
            self.is_paused = False

    def get_time(self) -> str:
        """
        Получение текущего времени секундомера
        """
        return self.time_difference
