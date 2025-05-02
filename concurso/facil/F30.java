import java.util.*;

public class F30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa los números");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x % y == 0) {
            System.out.println("X(" + x + ") es divisible entre Y(" + y + ")");
        } else {
            System.out.println("X(" + x + ") no es divisible entre Y(" + y + ")");
        }

        if (y % x == 0) {
            System.out.println("Y(" + y + ") es divisible entre X(" + x + ")");
        } else {
            System.out.println("Y(" + y + ") no es divisible entre X(" + x + ")");
        }

        if (x > y) {
            System.out.println("X(" + x + ") es el número mayor");
        } else if (y > x) {
            System.out.println("Y(" + y + ") es el número mayor");
        } else {
            System.out.println("Ambos números son iguales");
        }

        if (x % 2 != 0 && y % 2 != 0) {
            System.out.println("Ambos números son impares");
        } else {
            System.out.println("Ambos números no son impares");
        }
    }
}
