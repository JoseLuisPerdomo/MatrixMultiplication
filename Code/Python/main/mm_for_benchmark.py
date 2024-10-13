import random


def matrix_multiplication_inefficient(sizes):
    for n in sizes:

        a = [[random.random() for _ in range(n)] for _ in range(n)]
        b = [[random.random() for _ in range(n)] for _ in range(n)]
        c = [[0 for _ in range(n)] for _ in range(n)]

        for i in range(n):
            for j in range(n):
                for k in range(n):
                    c[i][j] += a[i][k] * b[k][k]


def matrix_multiplication_efficient(sizes):
    for n in sizes:

        a = [[random.random() for _ in range(n)] for _ in range(n)]
        b = [[random.random() for _ in range(n)] for _ in range(n)]
        c = [[0 for _ in range(n)] for _ in range(n)]

        for i in range(n):
            for k in range(n):
                for j in range(n):
                    c[i][j] += a[i][k] * b[k][k]


