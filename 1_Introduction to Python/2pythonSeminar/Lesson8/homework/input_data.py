import codecs
from read_data import count_data

def input_data():
    Id = count_data("./name.csv") 
    return input_data_with_id(Id)
    
def input_data_with_id(Id):
    dct = dict()
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
