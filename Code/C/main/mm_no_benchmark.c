#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(int argc, char* argv[]) {
    if (argc != 2) {
        fprintf(stderr, "Uso: %s <n>\n", argv[0]);
        return 1;
    }

    int n = atoi(argv[1]);
    
    double** a = malloc(n * sizeof(double*));
    double** b = malloc(n * sizeof(double*));
    double** c = malloc(n * sizeof(double*));
    
    for (int i = 0; i < n; ++i) {
        a[i] = malloc(n * sizeof(double));
        b[i] = malloc(n * sizeof(double));
        c[i] = malloc(n * sizeof(double));
    }

    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
            a[i][j] = (double) rand() / RAND_MAX;
            b[i][j] = (double) rand() / RAND_MAX;
            c[i][j] = 0.0;
        }
    }

    clock_t start = clock();
    for (int i = 0; i < n; ++i) {
        for (int k = 0; k < n; ++k) {
            for (int j = 0; j < n; ++j) {
                c[i][j] += a[i][k] * b[k][j];
            }
        }
    }

    clock_t stop = clock();
    double diff = ((double)(stop - start)) / CLOCKS_PER_SEC;

    printf("%0.6f\n", diff);

    for (int i = 0; i < n; ++i) {
        free(a[i]);
        free(b[i]);
        free(c[i]);
    }
    free(a);
    free(b);
    free(c);

    return 0;
}