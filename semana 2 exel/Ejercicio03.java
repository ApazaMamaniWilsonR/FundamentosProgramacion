import javax.swing.JOptionPane;
public class Ejercicio03 {
    public static void main(String[] args) {
        double s=Integer.parseInt(JOptionPane.showInputDialog("ingrese el salario:"));

        double salario=s*40;

        JOptionPane.showMessageDialog(null, "El pago final es: "+salario);
    }
}