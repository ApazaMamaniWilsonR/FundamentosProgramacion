import javax.swing.JOptionPane;
public class Suma {
    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));
        
        int suma=n1+n2;

        JOptionPane.showMessageDialog(null, "La suma es: "+suma);
    }
}