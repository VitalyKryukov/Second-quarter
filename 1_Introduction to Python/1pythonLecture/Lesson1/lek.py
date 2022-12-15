#print ('hello world')
#value = None
#a = 123
#b = 1.23
#print(type(a))
#print(type(b))
#value = 777
#print(type(value))

#s = 'hello bro'
#print(s)

#print (a, b, s)# variant 1
#print (a, '-',b, '-' ,s)# variant 2
#print('{1} - {2} - {0}'.format(a,b,s))# variant 3
#print(f'{a} - {b} - {s}')# variant 4

#f = True #логическая переменная
#print(f)

#list = [1,2,3,'hello']# объявляем список (аналог массива в python)
#print (list)

#print('введите a')
#a = float(input())
#print('введите b')
#b = float(input())
#print (a, b)
#print('{} {}'.format(a,b))
#print(f'{a} {b}')

#print (a, ' + ', b, ' = ', a+b)

# Арифметические операции

#a = 1.31231223
#b = 3
#c = round(a * b,7)
#print(c)

#a = 3
#a += 5
#print(a)

#Логические операции

#a = 1 < 3 and 5 > 2
#a = 1==2 #сравнение
#a = 1!=2#неравенство
#a = 1<3<5<10 #можно использовать тройные неравенства
#print(a)

#f = 1 > 2 or 4 < 6
#print(f)

#f = [1,2,3,4]
#print(f)
#print(2 in f) # 2 - содержится в списке f
#print(not 2 in f) # 2 - не содержится в списке f

#iss_odd = f[2] % 2 == 0 #проверка на четность
#iss_odd = not f[1] % 2 #проверка на четность с использованием not
#print(iss_odd)

# Управляющие конструкции

#a = int(input('a = '))
#b = int(input('b = '))
#if a > b:
#    print(a)
#else:
#    print(b)

#for

#for i in 1,2,3,4,5:
#    print(i**2)

#list = [1,2,3,4,5]
#for i in list:
#    print(i**2)

#r = range(10)
#for i in range(10):
#for i in range(1, 5):
#for i in range(1, 10, 2):
#for i in 'qwerty':
#    print(i)

#text = 'Я есть Грут'
#help(text.istitle)

#Списки

#база
#numbers = [1,2,3,4,5]
#print(numbers)
#ran = range(1,6)
#print(type(ran))
#numbers = list(ran) # приводим ran к типу numbers
#print(type(numbers))
#print(numbers)
#numbers[0] = 10
#print(f'{len(numbers)} Len')
#print(numbers)
#for i in numbers:
#    i *=2
#    print(i)
#print(numbers)

# Расширенный функционал

colors = ['red', 'green', 'blue']

for e in colors:
    print(e)
for e in colors:
    print(e*2)

colors.append('gray')
print(colors == ['red', 'green', 'blue', 'gray'])
colors.remove('red')
del colors[0]