import javax.swing.JOptionPane;

public class Examen05 {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));

        double suma=((n*(n+1))/2);

        double r=suma/n;

        JOptionPane.showMessageDialog(null, "La suma entre n es: "+r);
    }
}