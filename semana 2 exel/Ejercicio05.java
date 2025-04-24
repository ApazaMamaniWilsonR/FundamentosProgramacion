import javax.swing.JOptionPane;
public class Ejercicio05 {
    public static void main(String[] args) {
        double p=Integer.parseInt(JOptionPane.showInputDialog("ingrese el precio:"));
        double d=Integer.parseInt(JOptionPane.showInputDialog("ingrese el descuento:"));

        double precio=p-(p*(d/100));

        JOptionPane.showMessageDialog(null, "El precio final: "+precio);
    }
}