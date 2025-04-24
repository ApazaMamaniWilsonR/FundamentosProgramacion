import javax.swing.JOptionPane;

public class Ejercicio04 {

    public static void main(String[] args) {
        double a=1;
        double b=2;
        double c=4;
        double d=5;

        double x=((a*b)-(b*c))*c;
        double y=((a+b)*(b+c))/3;
        double z=((c+Math.pow(d,2))*a)%d;
        double resultado=x+Math.pow(y,2)+z;
        
        JOptionPane.showMessageDialog(null,resultado);
    }
}