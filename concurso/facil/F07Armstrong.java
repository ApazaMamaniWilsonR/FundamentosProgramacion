/*Escribe una función que calcule si un número dado es un número de Armstrong 
(o también llamado narcisista).
*/
import javax.swing.JOptionPane;
public class F07Armstrong {
    public static void main(String[] args) {
        String num=JOptionPane.showInputDialog("Ingrese un numero: ");
        int suma=0;
        for (int i = 0; i < num.length(); i++) {
            int dig=Integer.parseInt(String.valueOf(num.charAt(i)));
            suma+=Math.pow(dig,num.length());
        }
        if (suma==Integer.parseInt(num)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}