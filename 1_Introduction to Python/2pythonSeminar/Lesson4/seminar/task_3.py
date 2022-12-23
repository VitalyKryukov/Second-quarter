# 3. Задайте два числа. Напишите программу, которая найдёт НОК (наименьшее общее кратное) этих двух чисел.

# # V1
# def noc(a, b):
#     m = a * b
#     while a != 0 and b != 0:
#         if a > b:
#             a %= b
#         else:
#             b %= a
#     return m // (a + b)
 
 
# while 1:
#     try:
#         x = int(input('a='))
#         y = int(input('b='))
#         print('НОК:', noc(x, y))
#     except:
#         break

# # if __name__ == '__main__':
# #     noc(a, b)

#V2
number_1 = int(input('Введите первое число: '))
number_2 = int(input('Введите второе число: '))
max_num = max(number_1, number_2)
min_num = min(number_1, number_2)
for num in range(max_num, number_1*number_2 + 1, max_num):
    if num % min_num == 0:
        print(num)
        break

