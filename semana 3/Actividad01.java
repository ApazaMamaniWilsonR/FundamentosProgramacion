import javax.swing.JOptionPane;

public class Actividad01 {
    public static void main(String[] args) {
        double n=Double.parseDouble(JOptionPane.showInputDialog("ingrese el digito: "));

        if (n%2==0){
            JOptionPane.showMessageDialog(null,"es par");
        }else {
            JOptionPane.showMessageDialog(null,"es impar");
        }
    }
}