def fibonacci(num_k):
    fib_list = [0, 1]
    for i in range(num_k-1):
        fib_list.append(fib_list[i]-fib_list[i+1])  # в отрицательный диапозон
    fib_list.reverse()
    fib_list.append(1)
    for j in range(len(fib_list)-2, len(fib_list)-2+num_k-1):
        fib_list.append(fib_list[j] + fib_list[j + 1])  # в положительный диапозон
    return fib_list


def check():
    num = input('Введите число: ')
    while not num.isdigit():
        print('Введено некорректное значение! Попробуйте еще раз!')
        num = input('Введите число: ')
    return int(num)

def main():
    print('Начало старого модуля')
    my_list = fibonacci(check())
    print(my_list)
    print('Конец старого модуля')


if __name__ == "__main__":
    main()

