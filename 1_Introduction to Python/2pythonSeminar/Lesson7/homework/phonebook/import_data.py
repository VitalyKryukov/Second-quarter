# модуль

def import_data(data, sep=None):
    with open('G:/GeekBrains/1_Учебный процесс/2 четверть/Second quarter/1_Introduction to Python/2pythonSeminar/Lesson7/homework/phonebook/phone.csv', 'a+') as file:
        if sep == None:
            for i in data:
                file.write(f"{i}\n")
            file.write(f"\n")
        else:
            file.write(sep.join(data))
            file.write(f"\n")
