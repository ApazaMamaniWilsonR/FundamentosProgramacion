public class F06Factorial {
 public static void main(String[] args) {

        System.out.println(factorial(0) != -1 ? factorial(0) : "No tiene factorial");
        System.out.println(factorial(7) != -1 ? factorial(7) : "No tiene factorial");
        System.out.println(factorial(10) != -1 ? factorial(10) : "No tiene factorial");
        System.out.println(factorial(1) != -1 ? factorial(1) : "No tiene factorial");
        System.out.println(factorial(-1) != -1 ? factorial(-1) : "No tiene factorial");
    }
    private static int factorial(int n) {

        if (n < 0) {
            return -1;

        } else if (n <= 1) {
            return 1;

        } else {
            return n * factorial(n - 1);
        }
    }
}