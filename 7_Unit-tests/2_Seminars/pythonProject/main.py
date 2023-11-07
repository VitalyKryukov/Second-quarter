"""
Модуль, содержащий функцию main для сравнения средних значений двух списков чисел.
"""


class ListProcessor:
    """
    Класс для обработки списков чисел и вычисления их среднего значения.
    """

    def __init__(self, numbers):
        """
        Конструктор класса ListProcessor
        инициализирует объект, принимая список чисел.
        :param numbers: Список чисел
        """
        self.numbers = numbers

    def calculate_average(self):
        """
        Метод calculate_average вычисляет среднее значение
        (среднее арифметическое) для списка чисел.
        :return: Среднее значение списка чисел.
        Если список пуст, возвращает 0.
        """
        if len(self.numbers) == 0:
            return 0
        total = sum(self.numbers)
        return total / len(self.numbers)


class AverageComparer:
    """
    Класс для сравнения средних значений двух списков чисел.
    """

    @staticmethod
    def compare_averages(average1, average2):
        """
        Статический метод compare_averages сравнивает
        два средних значения и возвращает
        описание результата сравнения.
        :param average1: Среднее значение первого списка чисел.
        :param average2: Среднее значение второго списка чисел.
        :return: Строка, описывающая результат
        сравнения средних значений
        """
        if average1 > average2:
            return "Первый список имеет большее среднее значение"
        elif average1 < average2:
            return "Второй список имеет большее среднее значение"
        else:
            return "Средние значения равны"


def main(list1, list2):
    """
    Основная функция main для сравнения
    средних значений двух списков чисел.
    :param list1: Первый список чисел.
    :param list2: Второй список чисел.
    :return: Результат сравнения средних значений списков
    """
    processor1 = ListProcessor(list1)
    processor2 = ListProcessor(list2)

    average1 = processor1.calculate_average()
    average2 = processor2.calculate_average()

    comparer = AverageComparer()
    result = comparer.compare_averages(average1, average2)

    return result
