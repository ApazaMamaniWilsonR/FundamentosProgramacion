import javax.swing.JOptionPane;

public class NumeroPositivoWhile {
    
    public static void main(String[] args) {
        
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero: "));
        
        while (n<=0){
            n=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero: "));
        }
        JOptionPane.showMessageDialog(null,"el numero es positivo");
    }
}