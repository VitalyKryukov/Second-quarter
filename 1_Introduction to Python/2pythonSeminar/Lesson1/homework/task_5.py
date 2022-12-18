# Напишите программу, которая принимает на вход координаты двух точек
# и находит расстояние между ними в 2D пространстве.
# Пример:
# - A (3,6); B (2,1) -> 5,09
# - A (7,-5); B (1,-1) -> 7,21

import math

xa = float(input('Введите X координату точки A: '))
ya = float(input('Введите Y координату точки A: '))
xb = float(input('Введите X координату точки B: '))
yb = float(input('Введите Y координату точки B: '))

distance_points = round(math.sqrt(((xb - xa) ** 2) + ((yb - ya) ** 2)),2)
print(f'A ({xa}, {ya}); B ({xb}, {yb}) -> {distance_points}')