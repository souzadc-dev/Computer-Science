import java.util.HashMap;

public class HashMapTest {

    private static final int TAMANHO = 5;

    public static void main(String[] args) {

        HashMap<Integer, Produto> produtos = new HashMap<Integer, Produto>();
        long startTime = System.currentTimeMillis();

        for (int i = 1; i < TAMANHO; i ++) {
            for (int j = 0; j < i; j++) {
                produtos.put(i, new Produto(i, "Produto: "+i, i*.5));
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Tempo de execução: "+ (endTime - startTime)+ " ms.");

    }
}
