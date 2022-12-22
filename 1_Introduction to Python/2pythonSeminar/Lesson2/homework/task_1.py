# Напишите программу, которая принимает на вход вещественное 
# число и показывает сумму его цифр.
# Пример:
# - 6782 -> 23
# - 0,56 -> 11


# #V1
# number = input("Введите вещественное число: ")
# sum_digits = 0
# for i in number:
#     if i.isdigit():
#         sum_digits += int(i)
# print(sum_digits)

#V2
number = input('Введите вещественное число: ')
sum_digits = 0

for item in str(number):
    if item != "." and item != ",":
        sum_digits += int(item)
print(sum_digits)

