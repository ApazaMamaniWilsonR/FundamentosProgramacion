import javax.swing.JOptionPane;
public class Ejercicio09 {
    public static void main(String[] args) {
        double a=Double.parseDouble(JOptionPane.showInputDialog("ingrese a:"));
        double b=Double.parseDouble(JOptionPane.showInputDialog("ingrese b:"));
        double c=Double.parseDouble(JOptionPane.showInputDialog("ingrese c:"));

        double p=(-b+Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
        double n=(-b-Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);

        JOptionPane.showMessageDialog(null, "x1 = "+p+" y x2 = "+n);
    }
}