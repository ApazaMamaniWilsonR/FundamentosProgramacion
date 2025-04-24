import javax.swing.JOptionPane;

public class Actividad06 {
    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el digito: "));

        if ((n1%4==0&&n1%100!=0||n1%400==0)) {
            JOptionPane.showMessageDialog(null,"bisiesto");
        }else {
            JOptionPane.showMessageDialog(null,"no bisiesto");
        }
    }
}