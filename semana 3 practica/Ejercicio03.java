import javax.swing.JOptionPane;

public class Ejercicio03 {

    public static void main(String[] args) {
        double a=1;
        double b=2;
        double c=3;

        double x=(a+b+c)*b;
        double y=(b+c+4)/b;
        double z=(b+c+4)/2;
        double resultado=y+z;
        
        JOptionPane.showMessageDialog(null,resultado);
    }
}