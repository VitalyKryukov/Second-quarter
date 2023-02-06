import random
import csv
import logger as lg


file = open('./base_phone.csv', 'w')
newrecord = "ID,Name,Surname,PhoneNumber,email/n"
file.writelines(newrecord)

ls_name = ['Alex', 'Vity', 'Anton', 'Phedor', 'Inna',
           'Viktor', 'Olga', 'Svetlana', 'Boris', 'Igor', 'Anton']
ls_surname = ['Kustov', 'Mashohina', 'Kryukov',
              'Volobuev', 'Charlanov', 'Sokol', 'Aphanasov', 'Mironenko', 'Petrov']
ls_e_mail = ['@gmail.com', '@yandex.ru', '@mail.ru']


def list_of_numbers():
    # s = '+'
    randomListPhone = random.randint(79000000000, 80000000000)
    # s = s + str(randomListPhone)
    return str(randomListPhone)
# рандомно соеденить имена фамилии и номера телефонов (отдельный метод) def + присвоение id


def string_creation():
    s = ""
    s = s + random.choice(ls_name) + ',' + random.choice(ls_surname) + ',' + /
        list_of_numbers() + ',' + random.choice(ls_surname) + random.choice(ls_e_mail)
    return s


def start():
    for i in range(100):
        a = f'{str(i + 1)},{string_creation()}/n'
        file.write(a)
    file.close()


start()