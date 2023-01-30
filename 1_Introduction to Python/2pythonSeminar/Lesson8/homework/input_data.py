from write_data import count_data

def input_data():
    dct = dict()
    Id = count_data("name.csv") 
    dct["id"] = Id     # list[0] - это Id ученика
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
    # dct["id"] = Id     # list[0] - это Id ученика
    # dct["surname"] = "Фамилия"
    # dct["name"] = "Имя"
    # dct["class"] = "Класс"
    # dct["status"] = "статус"
    # dct["row"] = "ряд"
    # dct["col"] = "номер парты"
    # dct["city"] = "город"
    # dct["street"] = "улица"
    # dct["house"] = "дом"
    # dct["apartament"] = "квартира"
    # dct["other"] = "примечание"
    return dct