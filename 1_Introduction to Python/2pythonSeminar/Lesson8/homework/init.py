from read_data import read_data


def init():
    if not (len(read_data()) > 0):
        
        with open("G:/GeekBrains/1_Учебный процесс/2 четверть/Second quarter/1_Introduction to Python/2pythonSeminar/Lesson8/homework/name.csv", 'a+') as file:
            file.write("id;surname;name;class;status/n")

        with open("G:/GeekBrains/1_Учебный процесс/2 четверть/Second quarter/1_Introduction to Python/2pythonSeminar/Lesson8/homework/adress.csv", 'a+') as file:
            file.write("id;city;street;house;apartament;other/n")

        with open("G:/GeekBrains/1_Учебный процесс/2 четверть/Second quarter/1_Introduction to Python/2pythonSeminar/Lesson8/homework/class.csv", 'a+') as file:
            file.write("id;row;col/n")