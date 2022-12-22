# ПРИМЕР РАБОТЫ С ФАЙЛАМИ

# V_1
colors = ['red', 'ggreen', 'blue']
data = open('G\\data1.txt', 'a') # создали переменную и связали её с текстовым файлом: 
#                              где 'file.txt' - путь, 'a'/'r'/'w' - мод, как будем работать
data.writelines(colors) # .writelines - функционал, позволяющий, записать набор данных # разделителей не будет
data.write('\nLINE 12\n')
data.write('LINE 132\n')
data.close() # .close - после работы с функционалом, его нужно закрыть, 
#              т.е. разорвать подключение файловой переменной

# V_2
# with open('file.txt', 'a') as data: # где "with open('file.txt', 'w') as" - это переменная дата.
# #                                     данная конструкция принудительно разрывет связь, не нужно длать "data.close()"
#     data.write('Line 1111\n')
#     data.write('Line 2222\n')

#ПРИМЕР ЧТЕНИЯ ДАННЫХ ИЗ ФАЙЛА

# patch = 'file.txt'# создание пути к файлу
# data = open (patch, 'r')# открыть файл в режиме чтения
# for line in data: # позволяет считать файл построчно
#     print(line)
# data.close()

# exit() # все что ниже не будет выполняться

