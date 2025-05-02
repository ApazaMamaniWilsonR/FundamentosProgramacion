import java.util.*;

public class F29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de llantas 1:");
        int quantity1 = scanner.nextInt();
        System.out.println("Ingrese la cantidad de llantas 2:");
        int quantity2 = scanner.nextInt();

        int price = (quantity1 + quantity2 >= 5) ? 700 : 800;
        double total = (quantity1 + quantity2) * price;
        System.out.println(quantity1 + "x Llantas, Total: " + total + ", " + price + " c/u");
    }
}
