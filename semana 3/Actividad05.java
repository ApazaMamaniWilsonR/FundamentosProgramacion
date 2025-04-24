import javax.swing.JOptionPane;

public class Actividad05 {
    public static void main(String[] args) {
        double n=Double.parseDouble(JOptionPane.showInputDialog("ingrese nota: "));
        
        if (n<1){
            JOptionPane.showMessageDialog(null,"error");
        
        }else if (n>60){
            JOptionPane.showMessageDialog(null,"adulto mayor");
        }else if (n>18){
            JOptionPane.showMessageDialog(null,"adulto: ");
        }else if (n>12){
            JOptionPane.showMessageDialog(null,"adolescente: ");
        }else {
            JOptionPane.showMessageDialog(null,"niño: ");
        }
    }
}