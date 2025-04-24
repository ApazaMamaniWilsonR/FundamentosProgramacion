import javax.swing.JOptionPane;
public class Fahrenheit {
    public static void main(String[] args) {
        double c=Integer.parseInt(JOptionPane.showInputDialog("ingrese los grados celsius:"));

        double f=((c*9)/5)+32;

        JOptionPane.showMessageDialog(null, "El grados fahrenheit son: "+f);
    }
}