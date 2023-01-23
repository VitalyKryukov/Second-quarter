import logger

def get_data():
    a = input('Введите число: ')
    b = input('Введите число: ')
    operator = input('Введите оператор: ')
    logger.log_all(f'Мы получаем переменную a = {a}, оператор = "{operator}", переменную b = {b}')
    if 'j' in a:
        a = complex(a)
    else:
        a = int(a)
    if 'j' in b:
        b = complex(b)
    else:
        b = int(b)
    return a, b, operator





