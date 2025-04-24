import java.util.Scanner;

public class Actividad07scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("ingrese el lado 1: ");
        int l1=scanner.nextInt();
        System.out.print("ingrese el lado 1: ");
        int l2=scanner.nextInt();
        System.out.print("ingrese el lado 1: ");
        int l3=scanner.nextInt();

        if (l1==l2 && l2==l3 && l1==l3) {
            System.out.print("equilatero: ");
        }else if (l1!=l2 && l2!=l3 && l1!=l3){
            System.out.print("escaleno");
        }else {
            System.out.print("isoceles");
        }
        scanner.close();
    }
}