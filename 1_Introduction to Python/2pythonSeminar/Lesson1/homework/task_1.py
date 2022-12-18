# Напишите программу, которая принимает на вход цифру, обозначающую день недели,
# и проверяет, является ли этот день выходным.
# Пример:
# - 6 -> да
# - 7 -> да
# - 1 -> нет

# variant 1
day_week_off = ['нет', 'нет', 'нет', 'нет', 'нет', 'да',  'да']
day = int(input('Введите номер дня недели: '))
if day >= 1 and day <= 7:
	print(f'{day} -> {day_week_off[day-1]}')
else:
	print ('Внимание! Введите корректное значение!')

# variant 2
# day = int(input('Введите номер дня недели: '))
# if day >= 1 and day <= 7:
#     if  day >= 6 and day <= 7:
#         print(f'{day} -> Да')
#     else:
#          print(f'{day} -> Нет')
# else:
# 	print ('Внимание! Введите корректное значение!')

# variant 3 (Для истории, на семинаре разюирали. Не оценивать.)
# def main(day):
#     print("Выходной!") if day == 6 or day == 7 else print("Не выходной!")
# day = int(input("Введите день недели: "))
# main(day)


