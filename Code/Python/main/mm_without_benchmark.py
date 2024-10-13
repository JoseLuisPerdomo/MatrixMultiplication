import random
from time import *


def matrix_multiplication_inefficient(sizes):

    print(f'The time of execution with inefficient memery access is:')

    for n in sizes:

        a = [[random.random() for _ in range(n)] for _ in range(n)]
        b = [[random.random() for _ in range(n)] for _ in range(n)]
        c = [[0 for _ in range(n)] for _ in range(n)]

        start = time()

        for i in range(n):
            for j in range(n):
                for k in range(n):
                    c[i][j] += a[i][k] * b[k][k]

        end = time()

        print(f'    For n = {n} is {round(end - start, 2)}')


def matrix_multiplication_efficient(sizes):
    print(f'The time of execution with efficient memery access is:')

    for n in sizes:

        a = [[random.random() for _ in range(n)] for _ in range(n)]
        b = [[random.random() for _ in range(n)] for _ in range(n)]
        c = [[0 for _ in range(n)] for _ in range(n)]

        start = time()

        for i in range(n):
            for k in range(n):
                for j in range(n):
                    c[i][j] += a[i][k] * b[k][k]

        end = time()

        print(f'    For n = {n} is {round(end - start, 2)}')


sizes = [100, 300, 700, 1000]

matrix_multiplication_inefficient(sizes)
matrix_multiplication_efficient(sizes)
