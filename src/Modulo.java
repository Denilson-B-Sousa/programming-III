public class Modulo {

    public static void main(String[] args) {


        System.out.println(isPrime());

    }

    public static int qtdDivisores(int x) {
        int count = 0;
        for(int i = 1; i < x; i++) {
            if(x % i == 0) {
                count++;
            }
        }

        return count;
    }

    public static boolean isPrime() {
        if(qtdDivisores(4) == 1) return true;
        return false;
    }

//    public double delta(double a, double b, double c) {
//        return b*b - 4 * a * c;
//    }
//
//    public double x1(double a, double b, double c) {
//        double aux = -b + Math.sqrt(delta(a, b, c));
//
//        return aux/2*a;
//
//    }
//
//    public double x2(double a, double b, double c) {
//        double aux = -b + Math.sqrt(delta(a, b, c));
//
//        return aux/2*a;
//    }
}
