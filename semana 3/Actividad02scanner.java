import java.util.Scanner;

public class Actividad02scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("ingrese el primer numero: ");
        int n1=scanner.nextInt();

        System.out.print("ingrese el segundo numero: ");
        int n2=scanner.nextInt();

        if (n1==n2){
            System.out.print("Son iguales");
        }else if(n1<n2){
            System.out.print("El mayor es: "+n2);
        }else{
            System.out.print("El mayor es: "+n1);
        }
        scanner.close();
    }
}