# # 1 Пример
# li = [x for x in range(1,20)]

# li = list(map(lambda x: x+10, li))

# print(li)

# # 2 Пример
# data = list(map(int, input().split()))
# print(data)

# # 3 Пример
# data = map(int, input().split())
# for e in data:
#     print(e)

# # 4 Пример - без сохранения в list можно пробежаться только 1 раз
# data = map(int,'1 2 3'.split())

# for e in data:
#     print(e)

# print('--')

# for e in data:
#     print(e)

# 5 Пример решения 3 задачи

def where(f, col):
    return[x for x in col if f(x)]

data = '1 2 3 5 8 15 23 38'.split()

res = map(int, data)
# print(res)
res = where(lambda x: not x%2, res)
# print(res)
res = list(map(lambda x: (x, x**2), res))
print(res)
