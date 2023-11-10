# Задача 1
# Необходимо написать в императивном стиле процедуру
# для сортировки числа в списке в порядке убывания.
# Можно использовать любой алгоритм сортировки.

# Вариант 1

# def sort_list_imperative(numbers):
#     # Копируем список, чтобы не изменять оригинальный за пределами функции
#     numbers_copy = numbers.copy()
#     sorted_numbers = []
#
#     # Итеративно выбираем максимальное число из копии и добавляем его в отсортированный список
#     while numbers_copy:
#         max_num = max(numbers_copy)
#         sorted_numbers.append(max_num)
#         numbers_copy.remove(max_num)
#
#     return sorted_numbers
#
#
# numbers = [4, 2, 8, 1, 6, 3, 7, 5]
# sorted_numbers = sort_list_imperative(numbers.copy())
# print("Отсортированный список по убыванию (исправленный ваш код):", sorted_numbers)

# Варинат 2: Быстрая сортировка

def quicksort_imperative(numbers):
    # Если список пуст или содержит только один элемент, он уже отсортирован
    if len(numbers) <= 1:
        return numbers

    # Используем стек для отслеживания подсписков, которые нужно отсортировать
    stack = [(0, len(numbers) - 1)]

    while stack:
        start, end = stack.pop()
        pivot_index = partition(numbers, start, end)

        # Добавляем подсписки для дальнейшей сортировки
        if pivot_index - 1 > start:
            stack.append((start, pivot_index - 1))
        if pivot_index + 1 < end:
            stack.append((pivot_index + 1, end))

    return numbers


def partition(numbers, start, end):
    # Выбираем опорный элемент
    pivot = numbers[end]
    i = start - 1

    # Разделяем элементы на две группы относительно опорного элемента
    for j in range(start, end):
        if numbers[j] >= pivot:
            i += 1
            numbers[i], numbers[j] = numbers[j], numbers[i]

    # Помещаем опорный элемент на свое место
    numbers[i + 1], numbers[end] = numbers[end], numbers[i + 1]
    return i + 1


numbers = [4, 2, 8, 1, 6, 3, 7, 5]
sorted_numbers = quicksort_imperative(numbers.copy())
print("Отсортированный список по убыванию (быстрая сортировка):", sorted_numbers)

# Варинат 3: Сортировка слиянием
# def mergesort_imperative(numbers):
#     if len(numbers) <= 1:
#         return numbers
#
#     # Создаем временный массив той же длины, что и оригинальный
#     temp = [0] * len(numbers)
#
#     # Итеративно увеличиваем размер подсписков и сливаем их
#     size = 1
#     while size <= len(numbers) - 1:
#         left = 0
#         while left < len(numbers) - 1:
#             mid = min((left + size - 1), (len(numbers) - 1))
#             right = ((2 * size + left - 1, len(numbers) - 1)[2 * size + left - 1 > len(numbers) - 1])
#
#             merge(numbers, temp, left, mid, right)
#             left = left + 2 * size
#
#         size = 2 * size
#
#     return numbers
#
#
# def merge(numbers, temp, left, mid, right):
#     i = left
#     j = mid + 1
#     k = left
#
#     while i <= mid and j <= right:
#         if numbers[i] >= numbers[j]:
#             temp[k] = numbers[i]
#             i += 1
#         else:
#             temp[k] = numbers[j]
#             j += 1
#         k += 1
#
#     while i <= mid:
#         temp[k] = numbers[i]
#         i += 1
#         k += 1
#
#     while j <= right:
#         temp[k] = numbers[j]
#         j += 1
#         k += 1
#
#     for i in range(left, right + 1):
#         numbers[i] = temp[i]
#
#
# numbers = [6, 4, 7, 3, 8, 5, 2, 1]
# mergesort_imperative(numbers)
# print("Отсортированный список по убыванию (сортировка слиянием):", numbers)
