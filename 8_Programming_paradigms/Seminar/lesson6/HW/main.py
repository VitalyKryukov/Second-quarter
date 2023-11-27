"""
Задача:
Реализовать секундомер в любой парадигме. Секундомер должен поддерживать следующий функционал:
- запуск
- пауза
- выход из паузы
- остановка

"""
# Импортируем класс Model из модуля model
from model import Model
# Импортируем класс Presenter из модуля presenter
from presenter import Presenter
# Импортируем класс View из модуля view
from view import View

# Создаем экземпляр класса Model для работы с данными
model = Model()

# Создаем экземпляр класса Presenter и передаем ему модель
presenter = Presenter(model)

# Создаем экземпляр класса View для отображения данных
view = View()

# Подключаем вьюшку к презентеру (чтобы ее можно было изменять при необходимости)
presenter.attach_view(view)

# Запускаем программу
presenter.run()
