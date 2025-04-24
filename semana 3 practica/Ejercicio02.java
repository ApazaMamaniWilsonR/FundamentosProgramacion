import javax.swing.JOptionPane;

public class Ejercicio02 {
    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero 1: "));
        
        if (n1>12) {
            JOptionPane.showMessageDialog(null,"La nota es aprobatoria: ");
        }else {
            JOptionPane.showMessageDialog(null,"La nota es desaprobatoria: ");
        }
    }
}