from datetime import datetime as dt

def temperature_logger(data):
    time = dt.now().strftime('%H:%M')
    with open('G:/GeekBrains/1_Учебный процесс/2 четверть/Second quarter/1_Introduction to Python/1pythonLecture/Lesson4/task_1/log.csv', 'a') as file:
        file.write('{};temperature;{}\n'
                    .format(time, data))

def pressure_logger(data):
    time = dt.now().strftime('%H:%M')
    with open('G:/GeekBrains/1_Учебный процесс/2 четверть/Second quarter/1_Introduction to Python/1pythonLecture/Lesson4/task_1/log.csv', 'a') as file:
        file.write('{};pressure;{}\n'
                    .format(time, data))

def wind_speed_logger(data):
    time = dt.now().strftime('%H:%M')
    with open('G:/GeekBrains/1_Учебный процесс/2 четверть/Second quarter/1_Introduction to Python/1pythonLecture/Lesson4/task_1/log.csv', 'a') as file:
        file.write('{};wind_speed;{}\n'
                    .format(time, data))
