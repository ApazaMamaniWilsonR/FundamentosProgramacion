import java.util.Scanner;

public class Actividad06scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("ingrese el año: ");
        int n=scanner.nextInt();

        if ((n%4==0&&n%100!=0||n%400==0)) {
            System.out.print("es bisiesto");
        }else {
            System.out.print("no es bisiesto");
        }
        scanner.close();
    }
}