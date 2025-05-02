import java.util.*;

public class F26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número natural de dos cifras:");
        int num = scanner.nextInt();

        int tens = num / 10;
        int ones = num % 10;
        int inverted = ones * 10 + tens;

        System.out.println(num + " --> " + inverted);
    }
}
