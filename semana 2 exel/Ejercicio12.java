import javax.swing.JOptionPane;
public class Ejercicio12 {
    public static void main(String[] args) {
        int h=Integer.parseInt(JOptionPane.showInputDialog("ingrese la hora:"));

        int minutos=h*60;
        int segundos=h*3600;

        JOptionPane.showMessageDialog(null, "Tiene: "+minutos+" minutos y "+segundos+" segundos.");
    }
}