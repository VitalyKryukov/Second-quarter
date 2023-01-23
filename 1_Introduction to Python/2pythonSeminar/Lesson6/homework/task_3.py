# list comprehension/map

# Задайте список из вещественных чисел. Напишите программу,
# которая найдёт разницу между максимальным и минимальным значением дробной части элементов.

# Пример:
# - [1.1, 1.2, 3.1, 5, 10.01] => 0.19

# v0
def fraction_difference(lst):
    difference_f = 0
    new_lst = [round(i%1,2) for i in lst if i%1 != 0]
    difference_f = max(new_lst) - min(new_lst)
    return difference_f

number_lst = list(map(float, input('Введите дробные числа через пробел:\n').split()))
print(f'{number_lst} => {fraction_difference(number_lst)}')