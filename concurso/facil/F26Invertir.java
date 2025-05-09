/*Dado un número natural de dos cifras, diseñe un algoritmo que permita obtener el número 
invertido. Ejemplo si se ingresa 23 que se muestre 32.
*/
import javax.swing.JOptionPane;
public class F26Invertir {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        int i;
        for (i=0;n!=0;n/=10) {
            i=i*10+n%10;
        }
        System.out.println(i);
    }
}