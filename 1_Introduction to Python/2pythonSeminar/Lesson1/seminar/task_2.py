# 2. Напишите программу, которая на вход принимает 5 чисел и находит максимальное из них.
#     Примеры:
    
#     - 1, 4, 8, 7, 5 -> 8
#     - 78, 55, 36, 90, 2 -> 90

# variant1
# max = 0
# for i in range(5):
#     num = int(input(f'Введите число {i+1}: '))
#     if num > max:
#         max = num
# print(max)

# variant2
# def get_numbers(num): 
#     list = []
#     for i in range(num):
#         list.append(int(input('Введите число: ')))
#     return list
    

# def find_max(list):
#     max = list[0]
#     for i in list:
#         if i>max:
#             max = i
#     return max

# list = get_numbers(5)
# print(find_max(list))

# variant3
# list = (-1, 4, 118, 7, 8)

# max = list[0]
# for num in  list[1:]:
#     if num > max:
#         max = num
# print(max)


# print(list[1:])

# variant4
# list = (-1, 4, 118, 7, 8)

# max = list[0]
# for i in  range(1,len(list)):
#     if list[i] > max:
#         max = list[i]
# print(max)

# variant5
def get_numbers(num): 
    list = []
    max = 0
    for i in range(num):
        num = int(input('Введите число: '))
        list.append(num)
        if num > max:
            max = num
    return list, max

my_list, num_max = get_numbers(5)
print(my_list)
print(num_max)
