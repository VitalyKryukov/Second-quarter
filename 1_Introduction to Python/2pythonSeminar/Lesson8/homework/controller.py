from push_data import *
from read_data import *
from print_data import *
from search_data import *
from edit_data import *
from del_data import *


def greeting():
    print("Здравствуйте!")

def start():
    print("Что желаем сделать:\n\
    1 - получить всю информацию о учениках;\n\
    2 - добавить ученика;\n\
    3 - поиск ученика;\n\
    4 - редактировать данные ученика;\n\
    5 - удалить ученика;\n\
    6 - выход.")
    ch = input("Введите цифру: ")
    while True:
        if ch == '1':
            data = read_data()
            print_data(data)
            start()
        elif ch == '2':
            push_data(input_data())
            start()
        elif ch == '3':
            info = input("Введите данные для поиска: ")
            data = read_data()
            item = search_data(info, data)
            if item != None:
                print_data(item, True)
            else:
                print("Данные не обнаружены")                
            start()
        elif ch == '4':
            data = read_data()
            edit_data(data)
            start()
        elif ch == '5':
            data = read_data()
            del_data(data)
            start()
        elif ch == '6':
            print("Сеанс окончен, хорошего дня!")
            break
        else:
            print("Введите корректную цифру!")
            start()
