# 2. Для натурального n создать словарь индекс-значение,
# состоящий из элементов последовательности 3n + 1. 
#     *Пример:*
#     - Для n = 6: {1: 4, 2: 7, 3: 10, 4: 13, 5: 16, 6: 19}
#my_dict = {1: 4, 2: 7, 'sdffs': 10, 4: 13, 5: 16, 6: 19}

# # 1) все ключи, уникальные
# # 2) ключами могут быть только неизменяемые типы данных
# # 3) значенииями могут быть любые типы данных
# # 4) неупорядоченные

# print(my_dict['sdffs'])
# print(my_dict[2])
# # 5) dict() - словарь
# # list() - список

# my_list = [[1, 4], [2, 7], ['sdffs', 10]]
# my_list = ([1, 4], [2, 7], ['sdffs', 10])
# my_list = [(1, 4),(2, 7), ('sdffs', 10)]
# my_list = ((1, 4),(2, 7), ('sdffs', 10))
# new_dict = dict(my_list)

# variant 1
# import os
# os.system('cls')
# n = int(input('n = '))
# dictionary = []
# for i in range(1, n+1):
#     dictionary.append([i, 3*i+1])
# print(dict(dictionary))# * перед dict выведет ключи

# variant 2
# import os
# import random
# os.system('cls')

# num = int(input('Enter a number: '))

# print('num = ', num, ': {', end='')
# for i in range(num):
#     print(f"{i+1}: {(i+1)*3 + 1}", end=', ')
# print('}')


# variant 3
n = int(input("Введите число: "))
dict = {}
for i in range(1, n+1):
    dict.update({i:3*i+1}) 
    #dict[i] = 3*i+1
print(dict)
