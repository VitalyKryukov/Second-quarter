from write_data import *
from push_data import *
from print_data import *
from input_data import *

def edit_data(data):
    if len(data) > 0:       
        
        # Очищаем файлы.
        clear_data('./name.csv')
        clear_data('./adress.csv')
        clear_data('./class.csv')
        
        id = input('Введите идентификатор записи: ')
        itemFound = False
        
        # Ищем заданный элемент и перезаписываем его. Остальные сохраняем без изменения.
        for item in data:
            if item[0] == id:
                itemFound = True
                push_data(input_data_with_id(id))
            else:
                push_list(item)
                
        if itemFound == False:
            print('Запись с заданным идентификатором не найдена')
            return
