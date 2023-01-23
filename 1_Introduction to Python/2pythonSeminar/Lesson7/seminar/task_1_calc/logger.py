
# def log_in(first_value, second_value, operator):
#     with open('G:/GeekBrains/1_Учебный процесс/2 четверть/Second quarter/1_Introduction to Python/2pythonSeminar/Lesson7/seminar/task_1_calc/logger.txt', 'a') as data:
#         data.write(f'{first_value} {operator} {second_value}\n')
#         return first_value,  second_value, operator

# def log_res(result):
#     with open('G:/GeekBrains/1_Учебный процесс/2 четверть/Second quarter/1_Introduction to Python/2pythonSeminar/Lesson7/seminar/task_1_calc/logger.txt', 'a') as data:
#         data.write(f'{result}')
#         return result

def log_all(text):
    with open('G:/GeekBrains/1_Учебный процесс/2 четверть/Second quarter/1_Introduction to Python/2pythonSeminar/Lesson7/seminar/task_1_calc/log.txt', 'a', encoding='utf-8') as data:
        data.write(text + '\n')

def log_out():
    with open('G:/GeekBrains/1_Учебный процесс/2 четверть/Second quarter/1_Introduction to Python/2pythonSeminar/Lesson7/seminar/task_1_calc/log.txt', 'r', encoding='utf-8') as data:
        print(*data.readlines())
