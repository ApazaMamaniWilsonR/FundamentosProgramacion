import javax.swing.JOptionPane;
public class Ejercicio20 {
    public static void main(String[] args) {
        double b1=Double.parseDouble(JOptionPane.showInputDialog("ingrese la primera base:"));
        double b2=Double.parseDouble(JOptionPane.showInputDialog("ingrese la segunda base:"));
        double h=Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura:"));

        double r=((b1+b2)*h)/2;

        String area=String.format("%.2f",r);

        JOptionPane.showMessageDialog(null, "el area es: "+area);
    }
}