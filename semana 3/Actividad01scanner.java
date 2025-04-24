import java.util.Scanner;

public class Actividad01scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("ingrese el numero: ");
        int n=scanner.nextInt();
        if (n==0){
            System.out.print("no es entero");
        }else if(n%2==0){
            System.out.print("Es par");
        }else{
            System.out.print("es impar");
            
        }
        scanner.close();
    }
}