import javax.swing.JOptionPane;
public class Ejercicio21 {
    public static void main(String[] args) {
        double r=Double.parseDouble(JOptionPane.showInputDialog("ingrese el radio:"));
        double h=Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura:"));

        double cilindro=Math.PI*Math.pow(r, 2)*h;

        String volumen=String.format("%.2f",cilindro);

        JOptionPane.showMessageDialog(null, "El volumen del cilindro es: "+volumen);
    }
}