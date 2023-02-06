from input_data import input_data
from write_data import write_data


def push_data(dct):
    # id;surname;name;class;status   - name.csv
    write_data([dct.get("id"), dct.get("surname"), dct.get("name"), dct.get("class"), dct.get("status")], "./name.csv")

    # id;city;street;house;apartament;other  - adress.csv
    write_data([dct["id"], dct["city"], dct["street"], dct["house"], dct["apartament"], dct["other"]], "./adress.csv")

    # id;row;col - class.csv
    write_data([dct["id"], dct["row"], dct["col"]], "./class.csv")
    
def push_list(lst):
    # id;surname;name;class;status   - name.csv
    write_data([lst[0], lst[1], lst[2], lst[3], lst[4]], "./name.csv")

    # id;city;street;house;apartament;other  - adress.csv
    write_data([lst[0], lst[5], lst[6], lst[7], lst[8], lst[9]], "./adress.csv")

    # id;row;col - class.csv
    write_data([lst[0], lst[10], lst[11]], "./class.csv")
