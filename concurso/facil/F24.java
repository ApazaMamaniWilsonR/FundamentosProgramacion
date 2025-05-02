import java.util.*;

public class F24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de niños:");
        int boys = scanner.nextInt();
        System.out.println("Ingresa la cantidad de niñas:");
        int girls = scanner.nextInt();

        int total = boys + girls;
        double boysPercentage = (double) boys / total * 100;
        double girlsPercentage = (double) girls / total * 100;

        System.out.println("Porcentaje niños: " + boysPercentage + "%");
        System.out.println("Porcentaje niñas: " + girlsPercentage + "%");
    }
}
