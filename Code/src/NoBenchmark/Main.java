package NoBenchmark;

public class Main {
    public static void main(String[] args) {

        int[] sizes = {100, 500, 1000, 1200};


        for (int size : sizes) {
            Matrix matrix = new Matrix(size);
            matrix.multiply();
        }
    }
}
