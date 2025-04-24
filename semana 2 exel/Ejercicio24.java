import javax.swing.JOptionPane;
public class Ejercicio24 {
    public static void main(String[] args) {
        double r=Double.parseDouble(JOptionPane.showInputDialog("ingrese el radio:"));
        double h=Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura:"));

        double cilindro=(Math.PI*Math.pow(r, 2)*h)/3;

        String volumen=String.format("%.2f",cilindro);

        JOptionPane.showMessageDialog(null, "El volumn del cono es: "+volumen);
    }
}