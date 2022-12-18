#Множества, продолжение

a = {1,2,3,5,8}
b = {2,5,8,13,21}

c = a.copy()# Создаем множество на остновании имеющегося
print(c)

u = a.union(b)# Объединяем множества
print(u)

i = a.intersection(b)# Пересечение
print(i)

dl = a.difference(b)# Уникалные в первом множестве
print(dl)

dr = b.difference(a)# Уникалные во втором множестве
print(dr)

#Что это такое?
q = a\
    .union(b)\
    .difference(a.intersection(b))
print(q)

s = frozenset(a)# создаем неизменяемое множество