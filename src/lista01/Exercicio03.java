package lista01;

public class Exercicio03 {
    public static void main(String[] args) {

        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int indice = 1;
        imprimir(vetor);

        System.out.println("\n\nElemento do vetor que possui índice = " + indice + ":");
        System.out.println(vetor[indice]);
    }

    public static void imprimir(int[] vetor) {
        for (int elemento : vetor) {
            System.out.print(elemento + " ");
        }
    }
}
