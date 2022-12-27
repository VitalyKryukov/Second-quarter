# Напишите программу, которая найдёт произведение пар чисел списка.
# Парой считаем первый и последний элемент, второй и предпоследний и т.д.

# Пример:
# - [2, 3, 4, 5, 6] => [12, 15, 16];
# - [2, 3, 5, 6] => [12, 15]

#v0
import math

def product_lst (lst):
	product_list = []
	for i in range(int(math.ceil(len(lst)/2))):
		product_list.append(lst[i] * lst[len(lst)-i-1])
	return product_list

number_lst = list(map(int, input('Введите числа через пробел:\n').split()))
print(f'{number_lst} => {product_lst(number_lst)}')


# #v1
# def mult_lst(lst):
#     l = len(lst)//2 + 1 if len(lst) % 2 != 0 else len(lst)//2
#     new_lst = [lst[i]*lst[len(lst)-i-1] for i in range(l)]
#     print(new_lst)

# lst = [2, 3, 4, 5, 6]
# mult_lst(lst)
# lst = list(map(int, input("Введите числа через пробел:\n").split()))
# mult_lst(lst)

# # v2
# my_list = [2, 3, 5, 6]
# listNew = []

# for i in range(len(my_list)//2):
#     listNew.append(my_list.pop(0) * my_list.pop(-1))
# if len(my_list) == 1:
#     listNew.append(my_list.pop(0) ** 2)

# print(listNew)

# #v3
# from math import ceil

# a = []  
# len_ls = int(input('Введите длину списка: '))
# for i in range(len_ls):  
#     a.append(int(input(f'Введите {i + 1} число: ')))
# print(a)

# newArr = []
# for j in range(ceil(len_ls / 2)):
#     newArr.append(a[j] * a[-j - 1])

# print(newArr)

