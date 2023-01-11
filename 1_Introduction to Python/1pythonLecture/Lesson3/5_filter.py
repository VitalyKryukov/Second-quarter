# 1 Пример

# data = [x for x in range(10)]

# res = list(filter(lambda x: not x % 2, data))
# print(res)

# 2 Пример решения 3 задачи

data = '1 2 3 5 8 15 23 38'.split()

res = list(map(int, data))
print(res)
res = list(filter(lambda x: not x%2, res))
print(res)
res = list(map(lambda x: (x, x**2), res))
print(res)
