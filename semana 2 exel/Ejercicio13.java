import javax.swing.JOptionPane;
public class Ejercicio13 {
    public static void main(String[] args) {
        double d=Double.parseDouble(JOptionPane.showInputDialog("ingrese los dolares totaales:"));

        double r=d*3.64;

        String soles=String.format("%.2f",r);

        JOptionPane.showMessageDialog(null, "equivalen a: S/. "+soles+" soles.");
    }
}