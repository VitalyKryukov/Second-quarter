from write_data import count_data

def input_data():
    dct = dict()
    Id = count_data("G:/GeekBrains/1_Учебный процесс/2 четверть/Second quarter/1_Introduction to Python/2pythonSeminar/Lesson8/homework/name.csv") 
    dct["id"] = Id
    dct["surname"] = input('Введите фамилию: ')
    dct["name"] = input('Введите имя: ')
    dct["class"] = input('Введите класс: ')
    dct["status"] = input('Введите статус: ')
    dct["row"] = input('Введите ряд: ')
    dct["col"] = input('Введите номер парты: ')
    dct["city"] = input('Введите город: ')
    dct["street"] = input('Введите улицу: ')
    dct["house"] = input('Введите дом: ')
    dct["apartament"] = input('Введите квартиру: ')
    dct["other"] = input('Введите примечание: ')
    return dct