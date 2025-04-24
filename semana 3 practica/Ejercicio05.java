import javax.swing.JOptionPane;

public class Ejercicio05 {

    public static void main(String[] args) {
        double a=2;
        double b=2;
        double c=4;
        double d=5;

        a=(((a*Math.pow(b,3))-b)/3)*c;
        b=((a+b)*(b+c))/((a+b)/3);
        c=((((a+b)/(d/2))+Math.pow(d,2))*a)%d;
        double resultado=Math.pow(b,2)+c;
        
        JOptionPane.showMessageDialog(null,resultado);
    }
}