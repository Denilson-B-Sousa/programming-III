package lista01;

public class Exercicio06 {
    public static void main(String[] args) {
        int [] vet1 = {1, 2, 3, 4};
        int [] vet2 = {1, 2, 3, 4, 5};

        boolean resultado = saoIguais(vet1, vet2);
        System.out.println(resultado);
    }

    public static boolean saoIguais(int[] vet1, int[] vet2) {
        if(vet1.length != vet2.length) return false;

        for (int i = 0; i < vet1.length; i++) {
            if(vet1[i] != vet2[i]) return false;
        }

        return true;
    }


}
