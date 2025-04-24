import javax.swing.JOptionPane;

public class Ejercicio08 {

    public static void main(String[] args) {
        double a=1;
        double b=2;
        double c=3;
        double d=4;

        double x=((a*b)-(b*c))*c;
        double y=((a*b)+d)/3;
        double z=(((a*b)%2));
        double resultado=x+y+z+d;
        
        JOptionPane.showMessageDialog(null,resultado);
    }
}