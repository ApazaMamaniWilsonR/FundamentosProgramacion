import javax.swing.JOptionPane;
public class Ejercicio26 {
    public static void main(String[] args) {
        double c=Double.parseDouble(JOptionPane.showInputDialog("ingrese la circunferencia:"));

        double r=c/(2*Math.PI);

        String radio=String.format("%.2f",r);

        JOptionPane.showMessageDialog(null, "El radio del circulo es: "+radio);
    }
}