import javax.swing.JOptionPane;
public class Ejercicio02 {
    public static void main(String[] args) {
        double r=Integer.parseInt(JOptionPane.showInputDialog("ingrese el radio:"));

        double a=Math.PI*Math.pow(r, 2);

        String area=String.format("%.2f",a);

        JOptionPane.showMessageDialog(null, "El area del circulo es: "+area);
    }
}