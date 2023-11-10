# Задача 2
# Написать точно такую же процедуру, но в декларативном стиле

# Вариант 1

def sort_list_declarative(numbers):
    return sorted(numbers, reverse=True)


numbers = [4, 2, 8, 1, 6, 3, 7, 5]
sorted_numbers = sort_list_declarative(numbers.copy())
print("Отсортированный список по убыванию (ваш исправленный код):", sorted_numbers)

# вариант 2 Сортировка слиянием

# def mergesort_declarative(numbers):
#     if len(numbers) <= 1:
#         return numbers
#
#     mid = len(numbers) // 2
#     left = mergesort_declarative(numbers[:mid])
#     right = mergesort_declarative(numbers[mid:])
#
#     return merge_declarative(left, right)
#
#
# def merge_declarative(left, right):
#     merged = []
#     i = j = 0
#
#     while i < len(left) and j < len(right):
#         if left[i] >= right[j]:
#             merged.append(left[i])
#             i += 1
#         else:
#             merged.append(right[j])
#             j += 1
#
#     merged.extend(left[i:])
#     merged.extend(right[j:])
#
#     return merged
#
#
# numbers = [6, 4, 7, 3, 8, 5, 2, 1]
# sorted_numbers = mergesort_declarative(numbers.copy())
# print("Отсортированный список по убыванию (сортировка слиянием в декларативном стиле):", sorted_numbers)
