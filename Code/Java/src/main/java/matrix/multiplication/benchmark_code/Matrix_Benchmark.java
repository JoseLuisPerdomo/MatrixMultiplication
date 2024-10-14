package matrix.multiplication.benchmark_code;

import org.openjdk.jmh.annotations.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)
public class Matrix_Benchmark {

    private double[][] a;
    private double[][] b;
    private double[][] c;

    @Param({"100", "500", "1000", "1200"})
    private int size;

    @Setup(Level.Trial)
    public void setup() {
        initializeMatrices();
    }

    private void initializeMatrices() {
        Random random = new Random();
        a = new double[size][size];
        b = new double[size][size];
        c = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                a[i][j] = random.nextDouble();
                b[i][j] = random.nextDouble();
                c[i][j] = 0;
            }
        }
    }

    @Benchmark
    public void multiply() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }
}
