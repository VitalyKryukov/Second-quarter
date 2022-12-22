# Задайте список из N элементов, заполненных числами из промежутка [-N, N].
# Найдите произведение элементов на указанных позициях.
# Позиции хранятся в файле file.txt в одной строке одно число.

import random
import math

def get_list(num_f):
    my_list_f = []
    for i in range(num_f):
        my_list_f.append(random.randint(-num_f, num_f))
    return my_list_f

n = int(input('Введите число элеменов списка: '))

n_list = get_list(n)
print(n_list)
sum_n_list = []

for i in range(int(math.ceil(n/2))):
    sum_n_list.append(n_list[i] * n_list[len(n_list)-i-1])

print(sum_n_list)

data = open('G:/GeekBrains/1_Учебный процесс/2 четверть/Second quarter/1_Introduction to Python/2pythonSeminar/Lesson2/homework/task_3.txt', 'a')
data.write(str(sum_n_list))
data.close()

# with open('G:/GeekBrains/1_Учебный процесс/2 четверть/Second quarter/1_Introduction to Python/2pythonSeminar/Lesson2/homework/task_3.txt', "w") as task_3:
#     for line in str(sum_n_list):
#         task_3.write(line + '\n')
