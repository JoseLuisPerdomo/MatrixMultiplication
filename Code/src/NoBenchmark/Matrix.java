package NoBenchmark;

import java.util.Random;

public class Matrix {
    private int n;
    private double[][] a;
    private double[][] b;
    private double[][] c;

    public Matrix(int n) {
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

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide the size of the matrices as an argument.");
            return;
        }
        int n = Integer.parseInt(args[0]);
        Matrix matrix = new Matrix(n);
        matrix.multiply();
    }
}
