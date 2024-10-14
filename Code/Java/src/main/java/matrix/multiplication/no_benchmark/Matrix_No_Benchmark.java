package matrix.multiplication.no_benchmark;

import java.util.Random;

public class Matrix_No_Benchmark {
    private int n;
    private double[][] a;
    private double[][] b;
    private double[][] c;

    public Matrix_No_Benchmark(int n) {
        this.n = n;
        this.a = new double[n][n];
        this.b = new double[n][n];
        this.c = new double[n][n];
        initializeMatrices();
    }

    private void initializeMatrices() {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = random.nextDouble();
                b[i][j] = random.nextDouble();
                c[i][j] = 0;
            }
        }
    }

    public void multiply() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        long stop = System.currentTimeMillis();
        System.out.println("Time taken for size " + n + ": " + (stop - start) * 1e-3 + " seconds");
    }
}
