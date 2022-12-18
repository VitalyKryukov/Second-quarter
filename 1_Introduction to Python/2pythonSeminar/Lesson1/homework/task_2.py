# Напишите программу для. проверки истинности утверждения 
# ¬(X ⋁ Y ⋁ Z) = ¬X ⋀ ¬Y ⋀ ¬Z для всех значений предикат.
# ¬ - not
# ⋁ - or
# ⋀ - and

# x = 0 y = 0 z = 0
# x = 1 y = 0 z = 0
# x = 0 y = 1 z = 0
# x = 0 y = 0 z = 1
# x = 1 y = 1 z = 0
# x = 0 y = 1 z = 1
# x = 1 y = 1 z = 1

for x in 0,1:
    for y in 0,1:
        for z in 0,1:
            assertion_check = not (x or y or z) == (not x and not y and not z)
            print(f'x = {x}, y = {y}, z = {z} -> {assertion_check}')

#variant 2 (разбор на семинаре. не оценивать)
# for x in range(2):
#     for y in range(2):
#         for z in range(2):
#             result = not (x or y or z) == (not x and not y and not z)
#             if result == True:
#                 print(x, y, z, 'Утверждение истинно')
#             else:
#                 print(x, y, z, '"Утверждение ложно')

# variant 3 (разбор на семинаре. не оценивать)
# for x in 0,1:
#     for y in 0,1:
#         for z in 0,1:
#             result = not (x or y or z) == (not x and not y and not z)
#             if result:
#                 print(x, y, z, 'Утверждение истинно')
#             else:
#                 print(x, y, z, '"Утверждение ложно')

# variant 4 (разбор на семинаре. не оценивать)
# for x in 0,1:
#     for y in 0,1:
#         for z in 0,1:
#             print(f'x = {x}, y = {y}, z = {z} ->',not (x or y or z) == (not x and not y and not z))
