# Обычное создание списка

# list = []

# for i in range(1,101):
#     if(i % 2 == 0):
#         list.append(i)

# print(list)

# # Более проще и красивее

# # list = [i for i in range(1,21)]# только добавить список
# # list = [i for i in range(1,21) if i % 2 == 0]# Добавить список и условие
# list = [(i, i) for i in range(1,21) if i % 2 == 0]# Добавить кортежи

# print(list)

# Пример с обработкой

def f(x):
    return x**3

list = [f(i) for i in range(1,21) if i % 2 == 0]

print(list)