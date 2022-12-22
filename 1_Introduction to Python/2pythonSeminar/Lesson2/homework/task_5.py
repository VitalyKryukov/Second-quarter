# Реализуйте алгоритм перемешивания списка.

# #V1
# import random

# N = int(input('введите размер списка = '))

# list = list(range(0,N))

# for el in range(0,N):
#     i = random.randint(0, N-1)
#     list[i], list[el] = list[el], list[i]

# print(f"{list}")

#V2
import random

my_list = [1, 2, 3, 4, 5, 6, 7]
random.shuffle(my_list)
# print(my_list)

from random import sample

listNew = sample(my_list, len(my_list))
print(listNew)



