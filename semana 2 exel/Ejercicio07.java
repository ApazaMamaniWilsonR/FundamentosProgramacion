import javax.swing.JOptionPane;
public class Ejercicio07 {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero de 3 digitos:"));

        int c=n/100;
        int d=(n%100)/10;
        int u=n%10;
        int suma=c+d+u;

        JOptionPane.showMessageDialog(null, "la suma de sus digitos es: "+suma);
    }
}