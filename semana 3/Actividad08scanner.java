import java.util.Scanner;

public class Actividad08scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("ingrese peso: ");
        double p=scanner.nextDouble();
        System.out.print("ingrese altura: ");
        double a=scanner.nextDouble();

        double IMC=p/Math.pow(a, 2);

        String r=String.format("%.2f", IMC);
        
        if (IMC<0){
            System.out.print("error");
        
        }else if (IMC>30){
            System.out.print("obesidad: "+r);
        }else if (IMC>25){
            System.out.print("sobrepeso: "+r);
        }else if (IMC>18.5){
            System.out.print("normal: "+r);
        }else {
            System.out.print("bajo peso: "+r);
        }
        scanner.close();
    }
}