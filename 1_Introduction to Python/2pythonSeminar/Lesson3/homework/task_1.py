# Задайте список из нескольких чисел. Напишите программу, которая
# найдёт сумму элементов списка, стоящих на нечётной позиции.

# Пример:
# - [2, 3, 5, 9, 3] -> на нечётных позициях элементы 3 и 9, ответ: 12

def sum_odd_index(lst):
    s = 0
    for i in range(len(lst)):
        if i % 2 != 0:
            s += lst[i]
    print(f"Сумма равна: {s}")

lst = [2, 3, 5, 9, 3]
sum_odd_index(lst)
lst = list(map(int, input("Введите числа через пробел:\n").split()))
sum_odd_index(lst)

# # 1
# import random as rand

# l = int(input('Введите длину списка: '))
# ls = [rand.randint(1,50) for i in range(l)]
# sum = 0
# for i in range(1, l, 2):                     
#     sum += ls[i]
# print(ls)
# print(f'Сумма чисел на нечетных позициях равна: {sum}')

# # 2
# import random as rand

# l = int(input('Введите длину списка: '))
# ls = [rand.randint(1,50) for i in range(l)]

# new_ls = ls[1:l:2]
# sum_nefw_ls = sum(new_ls)
# print(ls)
# print(new_ls)
# print(f'Сумма чисел на нечетных позициях равна: {sum_nefw_ls }')
