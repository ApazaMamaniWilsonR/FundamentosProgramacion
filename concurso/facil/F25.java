import java.util.*;

public class F25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el valor de venta:");
        double saleValue = scanner.nextDouble();

        double igv = saleValue * 0.18;
        double discount = (saleValue > 150000) ? saleValue * 0.25 : 0;
        double total = saleValue + igv - discount;

        System.out.println("IGV: " + igv);
        System.out.println("Descuento: " + discount);
        System.out.println("Total: " + total);
    }
}
