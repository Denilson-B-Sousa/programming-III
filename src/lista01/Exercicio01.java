package lista01;

public class Exercicio01 {
    public static void main(String[] args) {
        int[] vetor = {10, 4, 3, 2, 1, 2};
        int min = 1;
        int resultado = maior(vetor, min);
        System.out.println("O maior valor a partir da posição " + min + " é: " + resultado);
    }

    public static int maior(int[] vetor, int min) {
        int maiorValor = vetor[min];

        for (int i = min + 1; i < vetor.length; i++) {
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
            }
        }
        return maiorValor;
    }
}
