# from user_interface import get_data as gb
import logger

def calc(first_value, second_value, operator):
    logger.log_all(f'Производится расчет: {first_value} {operator} {second_value}')
    if operator == '+':
        return first_value + second_value
    elif operator == '*':
        return first_value * second_value
    elif operator == '-':
        return first_value - second_value
    elif operator == '/':
        return first_value / second_value

# def my_sum (first_value, second_value):
#     first_value, second_value = gb()
#     return first_value + second_value

# def my_mult (first_value, second_value):
#     first_value, second_value = gb()
#     return first_value * second_value

# def my_dif (first_value, second_value):
#     first_value, second_value = gb()
#     return first_value - second_value

# def my_div (first_value, second_value):
#     first_value, second_value = gb()
#     return first_value / second_value