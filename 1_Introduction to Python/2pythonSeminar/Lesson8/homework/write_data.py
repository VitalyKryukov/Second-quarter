# модуль

def clear_data(name):
    open(name, 'w', encoding='utf-8',
                 errors='ignore').close()

def write_data(data, name):
    with open(name, 'a+', encoding='utf-8',
                 errors='ignore') as file:
        file.write(";".join(map(str, data)))
        file.write(f"\n")
