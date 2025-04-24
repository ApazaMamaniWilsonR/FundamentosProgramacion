import javax.swing.JOptionPane;
public class Ejercicio23 {
    public static void main(String[] args) {
        double p=Double.parseDouble(JOptionPane.showInputDialog("ingrese el peso:"));
        double h=Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura:"));

        double r=p/(Math.pow(h, 2));

        String imc=String.format("%.2f",r);

        JOptionPane.showMessageDialog(null, "El IMC es:  "+imc);
    }
}