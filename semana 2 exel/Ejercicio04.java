import javax.swing.JOptionPane;
public class Ejercicio04 {
    public static void main(String[] args) {
        double p=Integer.parseInt(JOptionPane.showInputDialog("ingrese la primera nota:"));
        double s=Integer.parseInt(JOptionPane.showInputDialog("ingrese la segunda nota:"));
        double t=Integer.parseInt(JOptionPane.showInputDialog("ingrese la tercera nota:"));

        double r=(p+s+t)/3;

        String promedio=String.format("%.2f",r);

        JOptionPane.showMessageDialog(null, "El promedio es: "+promedio);
    }
}