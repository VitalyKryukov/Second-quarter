from calculation import calc
from user_interface import get_data as gb
from logger import log_all

def control_data():
    log_all('Записываем переменные. Вызывем функцию.')
    first_value, second_value, operator = gb()
    result = calc(first_value, second_value, operator)
    return result


