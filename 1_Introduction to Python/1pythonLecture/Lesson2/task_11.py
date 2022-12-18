#Списки, продолжение

list1 = [1,2,3,4,5]

print(list1.pop())# .pop() - удалить последний элемент списка
print(len(list1))
print(list1)

print(list1.pop(2))# .pop(2) - удалить конкретный элемент списка
print(len(list1))
print(list1)

print(list1.insert(2, 11))# .insert(2, 11) - добавить на конкретную позицию 2, значение 11
print(len(list1))
print(list1)

print(list1.append(33))# добавить значение в конец списка
print(len(list1))
print(list1)

