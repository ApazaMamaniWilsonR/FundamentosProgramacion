import javax.swing.JOptionPane;

public class Ejercicio02V2 {
    public static void main(String[] args) {
        double n1=Double.parseDouble(JOptionPane.showInputDialog("ingrese nota: "));
        
        if (n1>20||n1<0){
            JOptionPane.showMessageDialog(null,"error");
        }else if (n1>12.4) {
            JOptionPane.showMessageDialog(null,"aprobado: ");
            }else {
            JOptionPane.showMessageDialog(null,"desaprobado: ");
            }
    }
}