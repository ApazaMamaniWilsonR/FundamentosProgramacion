import java.util.Scanner;

public class Actividad04scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("ingrese un numero: ");
        int n=scanner.nextInt();
        if (n==0){
            System.out.print("error");
        }else if(n>0){
            System.out.print("es positivo");
        }else {
            System.out.print("es negativo");
        }
        scanner.close();
    }
}