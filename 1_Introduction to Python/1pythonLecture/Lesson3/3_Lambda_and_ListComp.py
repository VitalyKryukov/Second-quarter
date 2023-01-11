# Пример решения свой

# def f(x):
#     return x**2

# list = [(i, f(i)) for i in range(1,10) if i % 2 == 0]

# print(list)

# Пример решения преподавателя до этой лекции

# path = 'G:/GeekBrains/1_Учебный процесс/2 четверть/Second quarter/1_Introduction to Python/1pythonLecture/Lesson3/file.txt'
# f = open(path, 'r')
# data = f.read() + ' '
# f.close()

# numbers = []

# while data !='':
#     space_pos = data.index(' ')
#     numbers.append(int(data[:space_pos]))
#     data = data[space_pos+1:]

# out = []
# for e in numbers:
#     if not e % 2:
#         out.append((e, e**2))
# print(out)

# Пример решения после этой лекции

def select(f, col):
    return [f(x) for x in col]

def where(f, col):
    return[x for x in col if f(x)]

data = '1 2 3 5 8 15 23 38'.split()

res = select(int, data)
print(res)
res = where(lambda x: not x%2, res)
print(res)
res = select(lambda x: (x, x**2), res)
print(res)