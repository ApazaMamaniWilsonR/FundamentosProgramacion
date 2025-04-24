import javax.swing.JOptionPane;
public class Ejercicio18 {
    public static void main(String[] args) {
        int s=Integer.parseInt(JOptionPane.showInputDialog("ingrese el salario:"));

        int salario=((s*25)/100)+s;

        JOptionPane.showMessageDialog(null, "su nuevo salario es: S/: "+salario);
    }
}