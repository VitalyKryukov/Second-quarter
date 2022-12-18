# Напишите программу, которая принимает на вход координаты точки (X и Y),
# причём X ≠ 0 и Y ≠ 0 и выдаёт номер четверти плоскости, в которой
# находится эта точка (или на какой оси она находится).
# Пример:
# - x=34; y=-30 -> 4
# - x=2; y=4-> 1
# - x=-34; y=-30 -> 3

# variant 1
x = int(input('x = '))
y = int(input('y = '))
if x == 0 or y == 0:
    print('x ≠ 0 и y ≠ 0')
else:    
    quarter = 1
    if x < 0 and y > 0:
        quarter = 2
    elif x < 0 and y < 0:
        quarter = 3
    elif x > 0 and y < 0:
        quarter = 4
    print(f'{x}; {y}; {quarter}')
