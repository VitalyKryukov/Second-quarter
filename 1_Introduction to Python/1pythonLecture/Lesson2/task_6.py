# Кортежи

a = (3, 4, 41, 5)# () - преобразуют в кортеж
print(a)
print(a[0])# обращение к элементу кортежа
print(a[-2])

for item in a:
    print(item)

#a[0] = 12# не работает для кортежей
# a = (3) - НЕ КОРТЕЖ, а INT
# a = (3,) - КОРТЕЖ