package lista01;

public class Exercicio02 {
    public static void main(String[] args) {
        int[] vetor = {4, 5, 6, 8};

        troca(vetor, 0, 3);

    }

    public static void troca(int[] vetor, int x, int y) {
        int aux = vetor[x];
        vetor[x] = vetor[y];
        vetor[y] = aux;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
