import javax.swing.JOptionPane;

public class Ejercicio07 {

    public static void main(String[] args) {
        double a=2;
        double b=3;
        double c=4;
        double d=5;

        double x=((a*b)-(b*c))*c;
        double y=((a+b)*(b+c)*(c+d))/3;
        double z=((c+a+d+b)*3)%d;
        double resultado=x+y+z;
        
        JOptionPane.showMessageDialog(null,resultado);
    }
}