import javax.swing.JOptionPane;

public class Actividad07 {
    public static void main(String[] args) {
        int L1=Integer.parseInt(JOptionPane.showInputDialog("ingrese lado 1: "));
        int L2=Integer.parseInt(JOptionPane.showInputDialog("ingrese lado 2: "));
        int L3=Integer.parseInt(JOptionPane.showInputDialog("ingrese lado 3: "));
        
        if (L1 == L2 && L2 == L3 && L1==L3) {
            JOptionPane.showMessageDialog(null,"equilatero: ");
        }else if (L1==L2||L2==L3||L1==L3){
            JOptionPane.showMessageDialog(null,"isoceles: ");
        }else {
            JOptionPane.showMessageDialog(null,"escaleno");
        }
    }
}