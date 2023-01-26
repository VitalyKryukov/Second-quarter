# Распаковка кортежей*

my_tuple = (1,2,3,4,5)
my_list = [5,7,8,9,0]
my_tuple_new = (11,22,33)
my_list_new = [(11,22,33), (111,222,333), (1111,2222,3333)]
el_1, el_2, el_3 = my_tuple_new
print(el_1)
print(el_2)
print(el_3)

for el_1, el_2, el_3 in my_list_new:
    print(el_1, '----', el_2, '====', el_3)

el_1, el_2, *el_3 = my_tuple
print(el_1)
print(el_2)
print(el_3)
print()

*el_1, el_2, el_3 = my_tuple
print(el_1)
print(el_2)
print(el_3)
print()

el_1, *el_2, el_3 = my_list
print(el_1)
print(el_2)
print(el_3)

for el_1, *el_2 in my_list_new:
    print(el_1, '----', el_2)


# # Еще вариант(добавление в кортежи)
# my_tuple = (1,2,3,4,5)
# my_list = [5,7,8,9,0]
# my_tuple_new = (11,22,33)
# new_list = []

# new_list.extend(my_tuple)
# print(new_list)

# new_list += my_list
# print(new_list)

# new_list += 'wetrergsdgsdghsdf'
# print(new_list)

# new_list.append(my_tuple)
# print(new_list)