/* Algoritmo que lea dos números, calculando y escribiendo el valor de su suma, resta, 
producto y división.
*/

import javax.swing.JOptionPane;

public class F23Operaciones {
    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero:"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero:"));
        int suma=n1+n2;
        int resta=n1-n2;
        int producto=n1*n2;
        double division=n1/n2;

        System.out.println(n1+" + "+n2+" = "+suma);
        System.out.println(n1+" - "+n2+" = "+resta);
        System.out.println(n1+" x "+n2+" = "+producto);
        System.out.println(n1+" / "+n2+" = "+division);
    }
}