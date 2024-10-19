from Code.Python.main.mm_for_benchmark import matrix_multiplication_efficient, matrix_multiplication_inefficient


def test_benchmark_mm_efficient(benchmark):
    benchmark(matrix_multiplication_efficient, [100, 200, 300, 400, 500])


def test_benchmark_mm_inefficient(benchmark):
    benchmark(matrix_multiplication_inefficient, [100, 200, 300, 400, 500])
