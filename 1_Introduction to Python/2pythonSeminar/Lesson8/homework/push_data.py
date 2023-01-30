from input_data import input_data
from write_data import write_data


def push_data():
    dct = input_data()

    # id;surname;name;class;status   - name.csv
    write_data([dct.get("id"), dct.get("surname"), dct.get("name"), dct.get("class"), dct.get("status")], "G:/GeekBrains/1_Учебный процесс/2 четверть/Second quarter/1_Introduction to Python/2pythonSeminar/Lesson8/homework/name.csv")

    # id;city;street;house;apartament;other  - adress.csv
    write_data([dct["id"], dct["city"], dct["street"], dct["house"], dct["apartament"], dct["other"]], "G:/GeekBrains/1_Учебный процесс/2 четверть/Second quarter/1_Introduction to Python/2pythonSeminar/Lesson8/homework/adress.csv")

    # id;row;col - class.csv
    write_data([dct["id"], dct["row"], dct["col"]], "G:/GeekBrains/1_Учебный процесс/2 четверть/Second quarter/1_Introduction to Python/2pythonSeminar/Lesson8/homework/class.csv")