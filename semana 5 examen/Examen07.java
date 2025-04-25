import javax.swing.JOptionPane;

public class Examen07 {
    public static void main(String[] args) {
        while (true) {
            int n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
            if (n1==0) break;
            
            int n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
            if (n2==0) break;

            int suma = n1 + n2;
            JOptionPane.showMessageDialog(null, "La suma es: " + suma);
        }
        JOptionPane.showMessageDialog(null, "error.");
    }
}