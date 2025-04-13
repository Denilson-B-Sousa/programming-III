package lista01;

public class Exercicio05 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 4, 9, 4};

        int resultado = contarOcorrencias(numbers, 4);
        System.out.println("Contar ocorrências: " + resultado);
    }

    public static int contarOcorrencias(int[] vetor, int x) {
        int count = 0;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] == x) {
                count++;
            }
        }

        return count;
    }
}
