import javax.swing.JOptionPane;
public class Ejercicio10 {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero:"));

        int suma=(n*(n+1))/2;

        JOptionPane.showMessageDialog(null, "La suma de los numeros es: "+suma);
    }
}