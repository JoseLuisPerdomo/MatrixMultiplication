package matrix.multiplication.no_benchmark;

public class Main {
    public static void main(String[] args) {

        int[] sizes = {100, 500, 1000, 1200};


        for (int size : sizes) {
            Matrix_No_Benchmark matrix = new Matrix_No_Benchmark(size);
            matrix.multiply();
        }
    }
}