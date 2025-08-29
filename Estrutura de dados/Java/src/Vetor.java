import java.util.Arrays;

public class Vetor {

    private static final int TAMANHO = 5;

    public static void main(String[] args) {
        long[] array = new long[TAMANHO];
        long startTime = System.currentTimeMillis();

        // O(n²)
        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                array[i] += j;
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Tempo de execução: "+ (endTime - startTime)+ " ms.");
    }
}

// 22:22
