# 1. Реализуйте алгоритм задания случайных чисел без
# использования встроенного генератора псевдослучайных чисел.

import time# метод работающий со временем
seconds = time.time()
# print(seconds)
print(int(seconds*1000)%100)


