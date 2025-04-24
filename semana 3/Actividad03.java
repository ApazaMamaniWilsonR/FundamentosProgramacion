import javax.swing.JOptionPane;

public class Actividad03 {
    public static void main(String[] args) {
        double n=Double.parseDouble(JOptionPane.showInputDialog("ingrese nota: "));
        
        if (n<0||n>20){
            JOptionPane.showMessageDialog(null,"error");
        }else if (n>15){
            JOptionPane.showMessageDialog(null,"exelente");
        }else if (n>10){
            JOptionPane.showMessageDialog(null,"bueno: ");
        }else if (n>5){
            JOptionPane.showMessageDialog(null,"suficiente: ");
        }else {
            JOptionPane.showMessageDialog(null,"insuficiente: ");
        }
        
    }
}