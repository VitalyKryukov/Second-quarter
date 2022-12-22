my_list = [234,234,456,5678,345]
print(len(my_list))
print(range(len(my_list)))
print(list(range(len(my_list))))

for i in range(len(my_list)):
    print(i, end=' ')
print()    
for elem in my_list:
    print(elem, end=' ')
print()     
for i, elem in enumerate(my_list):
    print(i, '-' , elem)
