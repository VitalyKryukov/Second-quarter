import logging

logging.basicConfig(
    level=logging.INFO,
    filename='./phonebook.log',
    format='[%(asctime)s] [%(levelname)s] [%(module)s] [%(funcName)s: %(lineno)d] => %(message)s',
    datefmt='%d.%m.%Y %H:%M:%S ',
)

# Ссылка на документацию по работе модуля: https://webdevblog.ru/logging-v-python/