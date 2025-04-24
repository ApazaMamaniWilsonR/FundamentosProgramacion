import javax.swing.JOptionPane;
public class Ejercicio25 {
    public static void main(String[] args) {
        double l=Double.parseDouble(JOptionPane.showInputDialog("ingrese las libras:"));

        double r=l*0.453592;

        String kilogramos=String.format("%.2f",r);

        JOptionPane.showMessageDialog(null, "Lo kilogramos son: "+kilogramos);
    }
}