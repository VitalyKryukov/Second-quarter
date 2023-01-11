# # 1 Присвоили переменной функцию
# def f(x):
#     return x**2


# g = f
# print(type(f))
# print(type(g))
# print(f(2))
# print(g(2))

# # 2 Пример использования функцией другой функцией

# def calc_1(x):
#     return x+10

# # print(calc_1(10))

# def calc_2(x):
#     return x*10

# # print(calc_2(10))

# def math(op, x):
#     print(op(x))

# math(calc_1, 10)
# math(calc_2, 10)

# # 3 Пример применение функцией, нескольких функций

# def sum(x,y):
#     return x+y

# f = sum

# def mylt(x,y):
#     return x*y

# def calc(op, a, b):
#     print (op(a,b))
#     # return op(a,b)

# calc(f, 4, 5)

# # 4 Пример с использованием lambda

# sum = lambda x, y: x + y

# def calc(op, a, b):
#     print (op(a,b))
#     # return op(a,b)

# calc(sum, 4, 5)

# 5 Еще пример с использованием lambda

def calc(op, a, b):
    print (op(a,b))
    # return op(a,b)

calc(lambda x, y: x + y, 4, 5)