# 1. Напишите программу, которая будет на вход принимать число N и выводить числа от -N до N
    
#     *Примеры:* 
    
#     - 5 -> -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5

# word = 'python'
# print(*word)
# print(*word, sep='-', end=' ')
# print(*word, sep='-', end='\n')
# print(*word, sep='\n')

# variant 1
# num = int(input('Введите число N: '))
# if num > 0:
#     for en in range(-num, num + 1):
#         print(en,end=', ')
# else:
#     for en in range(num, -num + 1):
#         print(en,end=', ')

# variant 2
num = int(input('введите число N: '))
my_list = range(-num, num+1, 1)
print(*my_list, sep=', ')
print(list(my_list))
