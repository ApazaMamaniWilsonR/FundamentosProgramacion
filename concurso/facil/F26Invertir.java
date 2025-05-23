/*Dado un número natural de dos cifras, diseñe un algoritmo que permita obtener el número 
invertido. Ejemplo si se ingresa 23 que se muestre 32.
*/
import javax.swing.JOptionPane;
public class F26Invertir {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        int u=n%10;
        int d=n/10;
        System.out.println(n+"-->"+u+d);
    }
}