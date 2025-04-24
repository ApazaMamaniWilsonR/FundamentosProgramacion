import javax.swing.JOptionPane;
public class Ejercicio16 {
    public static void main(String[] args) {
        double p=Double.parseDouble(JOptionPane.showInputDialog("ingrese la primer nota:"));
        double s=Double.parseDouble(JOptionPane.showInputDialog("ingrese la segunda nota."));
        double t=Double.parseDouble(JOptionPane.showInputDialog("ingrese la tercera nota:"));

        double r=((p*3)+(s*3)+(t*4))/10;

        String promedio=String.format("%.2f",r);

        JOptionPane.showMessageDialog(null, "El promedio ponderado es: "+promedio);
    }
}