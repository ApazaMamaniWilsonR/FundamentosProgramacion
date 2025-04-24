import javax.swing.JOptionPane;
public class Ejercicio22 {
    public static void main(String[] args) {
        double v=Double.parseDouble(JOptionPane.showInputDialog("ingrese el voltaje:"));
        double r=Double.parseDouble(JOptionPane.showInputDialog("ingrese la resistencia:"));

        double i=v/r;

        String corriente=String.format("%.2f",i);

        JOptionPane.showMessageDialog(null, "La corriente electrica es: "+corriente);
    }
}