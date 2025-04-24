import javax.swing.JOptionPane;
public class Ejercicio15 {
    public static void main(String[] args) {
        double d=Double.parseDouble(JOptionPane.showInputDialog("ingrese el numero a redondear:"));

        int entero=(int)Math.round(d);

        JOptionPane.showMessageDialog(null, "El numero redondeado es: "+entero);
    }
}