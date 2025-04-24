import javax.swing.JOptionPane;
public class Ejercicio06 {
    public static void main(String[] args) {
        int b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base:"));
        int a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura:"));

        int r=2*(b+a);

        JOptionPane.showMessageDialog(null, "El perimetro es: "+r);
    }
}