/*
Calcular el total que una persona debe pagar en una llantera, si el precio de cada llanta es de 
S/ 800 si se compran menos de 5 llantas y de S/ 700 si se compran 5 o más.
*/
import javax.swing.JOptionPane;
public class F29Llanta {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de llantas: "));
        int precio;
        if (n<5) {
            precio=n*800;
        } else {
            precio=n*700;
        }
        System.out.println(n+"x Llantas, Total: "+precio+", "+precio/n+" c/u");
    }
}