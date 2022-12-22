# Задайте список из n чисел последовательности
#(1+1\n)^n и выведите на экран их сумму.
# Пример:
# - Для n = 6: {1: 4, 2: 7, 3: 10, 4: 13, 5: 16, 6: 19}


n = int(input('Введите число N: '))
sequence_list = []
sum_sequence = 0
for item in range(1, n + 1):
    sequence = float(round((1 + (1 / n)) ** n,2))
    sequence_list.append(sequence)
    sum_sequence += sequence

print(sequence_list)
print(sum_sequence)




# #V1
# n = int(input('Введите число N: '))
# my_list = [] 
# sumEl = 0


# for item in range(1, n + 1):
#     my_list.append((item + (1 / item)) ** item)
# print(my_list)
# for j in range(len(my_list)):
#     sumEl += my_list[j]
# print('{:.2f}'.format(sumEl))
# # d = round(sumEl, 2)
# # print(d)

# #V2
# import math

# N = int(input('введите число = '))

# list = []
# sum = 0
# for i in range(1,N+1):
#    list.append(int(round((1 + 1/i)**i, 0)))
#    sum +=int(round((1 + 1/i)**i, 0))

# print(list)
# print(sum)

# #V3
# n = int(input('Введите число N: '))
# my_list = [] 
# sumEl = 0

# for item in range(1, n + 1):
#     elem = round((item + (1 / item)) ** item,2)
#     my_list.append(elem)
#     sumEl += elem
# print(my_list)
# print(sumEl)





