import javax.swing.JOptionPane;

public class Examen02 {
    public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));
        int b=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));

        double h=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));

        JOptionPane.showMessageDialog(null, "La hipotenusa es: "+h);
    }
}