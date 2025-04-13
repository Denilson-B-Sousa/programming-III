package lista01;

public class Exercicio04 {
    public static void main(String[] args) {

        int[] numbers = {4, 5, 6, 7, 8, 9};
        int result = buscar(numbers, 9, 0);

        System.out.println("Posição de X = " + result);
    }

    public static int buscar(int[] numbers, int x, int y) {
        for(int i = y; i < numbers.length; i++) {
            if(numbers[i] == x) {
                return i;
            }
        }
        return 1;
    }
}
