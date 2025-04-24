import javax.swing.JOptionPane;

public class Actividad04 {
    public static void main(String[] args) {
        double n=Double.parseDouble(JOptionPane.showInputDialog("ingrese el digito: "));

        if (n<0){
            JOptionPane.showMessageDialog(null,"negativo");
        }else if(n>0){
            JOptionPane.showMessageDialog(null,"positivo");
        }else {
            JOptionPane.showMessageDialog(null,"cero");
        }
    }
}