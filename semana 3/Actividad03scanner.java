import java.util.Scanner;

public class Actividad03scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("ingrese el primer numero: ");
        int n=scanner.nextInt();

        if (n<=0||n>20){
            System.out.print("error");
        }else if(n>=17){
            System.out.print("exelente");
        }else if(n>=15){
            System.out.print("bueno");
        }else if(n>=13){
            System.out.print("suficiente");
        }else{
            System.out.print("insuficiente");
        }
        scanner.close();
    }
}