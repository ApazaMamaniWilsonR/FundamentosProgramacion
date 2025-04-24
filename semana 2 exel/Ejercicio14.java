import javax.swing.JOptionPane;
public class Ejercicio14 {
    public static void main(String[] args) {
        double a=Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer cateto:"));
        double b=Double.parseDouble(JOptionPane.showInputDialog("ingrese el segundo cateto:"));

        double r=Math.sqrt( Math.pow(a,2)+Math.pow(b,2));

        String hipotenusa=String.format("%.2f",r);

        JOptionPane.showMessageDialog(null, "La hipotenusa es: "+hipotenusa);
    }
}