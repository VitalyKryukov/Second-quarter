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


# # v1
# lst = list(map(float, input("Введите числа через пробел:\n").split()))
# new_lst = [round(i%1,2) for i in lst if i%1 != 0]
# print(max(new_lst) - min(new_lst))

# # v2
# import random
# from random import randint
# import os
# os.system('cls')


# s = []
# s1 = []
# for i in range(randint(2, 10)):
#     num = random.uniform(0, 10)
#     s.append(round(num, 2))
#     num1 = s[i] % 1
#     s1.append(round(num1, 2))

# print("Случайно заданный список из вещественных чисел : ")
# print()

# print(s)
# print(s1)
# print()
# res = max(s1) - min(s1)
# print("Разница между максимальным и минимальным значением дробной части : ", res)

# # v2
# import random
# from random import randint

# s = [1.1, 1.2, 3.1, 5, 10.01] 
# s1 = []
# for i in s:
#     num1 = i % 1
#     s1.append(round(num1, 2))

# print("Случайно заданный список из вещественных чисел : ")
# print()

# print(s)
# print(s1)
# print()
# res = max(s1) - min(s1)
# print('''Разница между максимальным и 
# минимальным значением дробной части : ''', res)



