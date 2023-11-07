from main import ListProcessor, AverageComparer


def test_compare_averages():
    """
    Тест сравнивает средние значения
    :return:
    """
    processor1 = ListProcessor([1, 2, 3])
    processor2: ListProcessor = ListProcessor([4, 5, 6])
    comparer = AverageComparer()

    result = comparer.compare_averages(processor1.calculate_average(),
                                       processor2.calculate_average())
    assert result == 'Второй список имеет большее среднее значение'

    processor1 = ListProcessor([1, 2, 3])
    processor2 = ListProcessor([1, 2, 3])
    comparer = AverageComparer()

    result = comparer.compare_averages(processor1.calculate_average(),
                                       processor2.calculate_average())
    assert result == "Средние значения равны"


def test_empty_lists():
    """
    Тест пустых списков
    :return:
    """
    processor1 = ListProcessor([])
    processor2 = ListProcessor([4, 5, 6])
    comparer = AverageComparer()

    result = comparer.compare_averages(processor1.calculate_average(),
                                       processor2.calculate_average())
    assert result == "Второй список имеет большее среднее значение"


def test_negative_numbers():
    """
    Тест отрицательных чисел в списке
    :return:
    """
    processor1 = ListProcessor([-1, -2, -3])
    processor2 = ListProcessor([4, 5, 6])
    comparer = AverageComparer()

    result = comparer.compare_averages(processor1.calculate_average(),
                                       processor2.calculate_average())
    assert result == "Второй список имеет большее среднее значение"
