# 1. Задайте строку из набора чисел. Напишите программу,
# которая покажет большее и меньшее число.
# В качестве символа-разделителя используйте пробел.


number_list = input('Введите число через пробел ').split()

max_num = int(number_list[0])
min_num = int(number_list[0])
for el in number_list:
    el = int(el)
    if max_num < el:
        max_num = el
    if min_num > el:
        min_num = el

print(number_list)
print(max_num, min_num)

#Справочно:

# num = list(map(int,input('Введите число через пробел: ').split()))# map - берет итерируемый объект и применяет к каждому объекту функцию, которая прописна в первом аргументе

# print(num)

# my_list = input('Введите числа через пробел: ').split()
# print(my_list)
# num = list(map(len, my_list))


# print(num)

# # num2 = [int(num) for num in input().split()]

# # print(num2)
