import javax.swing.JOptionPane;

public class Ejercicio09 {

    public static void main(String[] args) {
        double a=2;
        double b=3;
        double c=4;
        double d=5;

        double x=((a+b+c)*b)/c;
        double y=((a+b)*c)/b;
        double z=((a+b+c)*(a+b))%2;
        double resultado=z;
        
        JOptionPane.showMessageDialog(null,resultado);
    }
}