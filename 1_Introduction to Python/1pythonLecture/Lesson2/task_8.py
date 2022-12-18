# Множества

colors = {'red', 'green', 'blue'}

print(type(colors))
print(colors)

colors.add('red')# .add - добавляет уникальное значение
print(colors)

colors.add('gray')# .add - добавляет уникальное значение
print(colors)

colors.remove('red')# .remove - удаляет уникальное значение, вызовет ошибку, если такого элемента нет
print(colors)

colors.discard('red')# .discard - удаляет уникальное значение, не вызовет ошибку, если такого элемента нет
print(colors)

colors.clear()# .clear - очистит множества
print(colors)