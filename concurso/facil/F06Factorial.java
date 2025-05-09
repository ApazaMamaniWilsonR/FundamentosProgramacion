/* Escribe una función que calcule y retorne el factorial de un número dado de forma recursiva.
Solucion en Java
 public static void main(String[] args) {
 */
public class F06Factorial {
    private static int factorial(int n) {
        if (n < 0) {
            return -1;
        } else if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {

        System.out.println(factorial(0));
        System.out.println(factorial(7));
        System.out.println(factorial(10));
        System.out.println(factorial(1));
        System.out.println(factorial(-5)==-1?"No tiene factorial":factorial(-5));
    }
}