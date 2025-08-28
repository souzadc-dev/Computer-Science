import java.util.Arrays;

public class Vetor {

    private static final int TAMANHO = 10_000_000;

    public static void main(String[] args) {
        long[] array = new long[TAMANHO];
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < TAMANHO; i++) {
            array[i] = i;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Tempo de execução: "+ (endTime - startTime)+ " ms.");
       // System.out.println(Arrays.toString(array));
    }
}
