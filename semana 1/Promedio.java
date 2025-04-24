import javax.swing.JOptionPane;
public class Promedio {
    public static void main(String[] args) {
        double n1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer digito:"));
        double n2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo digito:"));
        double n3=Integer.parseInt(JOptionPane.showInputDialog("ingrese el tercer digito:"));

        double promedio=(n1+n2+n3)/5;

        JOptionPane.showMessageDialog(null, "El promedio es: "+promedio);
    }
}