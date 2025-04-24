import java.util.Scanner;

public class Actividad05scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("ingrese la edad: ");
        int n=scanner.nextInt();
        
        if (n<1){
            System.out.print("error");
        
        }else if (n>60){
            System.out.print("adulto mayor");
        }else if (n>18){
            System.out.print("adulto");
        }else if (n>12){
            System.out.print("adolecente");
        }else {
            System.out.print("niño");
        }
        scanner.close();
    }
}