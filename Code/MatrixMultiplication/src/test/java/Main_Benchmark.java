import matrix.multiplication.benchmark_code.Matrix_Benchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class Main_Benchmark {
    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(Matrix_Benchmark.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}

