/*Ingresar dos números entero y luego determinar y mostrar:
a. Si el primero es divisible por el segundo
b. Si el segundo es divisible por el primero
c. Cuál de los dos es mayor; en caso que sean iguales, mostrar mensaje adecuado
d. Si ambos son impares
*/
import javax.swing.JOptionPane;
public class F30Divisible {
    public static void main(String[] args) {
        int x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));
        int y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));

        if (x % y == 0) {
            System.out.println(x+" es divisible entre "+y);
        } else {
            System.out.println(x+" no es divisible entre "+y);
        }
        if (y % x == 0) {
            System.out.println(y+" es divisible entre "+x);
        } else {
            System.out.println(y+" no es divisible entre "+x);
        }
        if (x > y) {
            System.out.println(x+" es el número mayor");
        } else if (y > x) {
            System.out.println(y+" es el número mayor");
        } else {
            System.out.println("Ambos números son iguales");
        }
        if (x % 2 != 0 && y % 2 != 0) {
            System.out.println("Ambos números son impares");
        } else {
            System.out.println("Ambos números no son impares");

        }
    }
}