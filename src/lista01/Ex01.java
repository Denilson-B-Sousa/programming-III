package lista01;

public class Ex01 {
    public static void main(String[] args) {

        int array[] = {10, 5, 4, 2, 2};
        int array2[] = {9, 4, 3, 1, 0};
        int array3[] = {7, 5, 6, 1, 4};

        System.out.println(maior(array, 1));

        imprimir(array2);

        troca(array2, 1, 2);

        buscar(array, 4, 2);
    }

    private static void troca(int[] array, int x, int y) {
        int aux = array[x];
        array[x] = array[y];
        array[y] = aux;

    }

    private static int buscar(int v[], int in, int x){
        for(int i = in; i < v.length; i++) {
            if(v[i] == x) {
                return i;
            }
        }

        return -1;
    }

    public static int maior(int[] vetor, int min) {

        int maior = vetor[min];

        for (int i = min + 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        return maior;
    }

    public static void imprimir(int array[]) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(" " + array[i]);
        }
    }

}
