# 1. Напишите программу, которая принимает на вход число N
# и выдаёт последовательность из N членов. 
# *Пример:*
# - Для N = 5: 1, -3, 9, -27, 81

import os
import random
os.system('cls')
N = int(input('N = '))
for i in range(N):
    print(random.randrange(-100, 100), end=" ") # случайное число
