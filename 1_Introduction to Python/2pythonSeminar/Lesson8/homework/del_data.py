from write_data import *
from push_data import *
from print_data import *

def del_data(data):
    if len(data) > 0:

        # Очищаем файлы.
        clear_data('./name.csv')
        clear_data('./adress.csv')
        clear_data('./class.csv')

        id = input('Введите идентификатор записи: ')
        itemFound = False
        
        # Ищем заданный элемент и записываем обратно только те данные, которые не нужно удалять.
        for item in data:
            if item[0] == id:
                itemFound = True
            else:
                push_list(item)
                
        if itemFound == False:
            print('Запись с заданным идентификатором не найдена')
            return
