import javax.swing.JOptionPane;

public class NumeroPositivoDoWhile {
    
    public static void main(String[] args) {

        int n;
        do{
            n=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero: "));
            
        }while (n<=0);

        JOptionPane.showMessageDialog(null,"el numero es positivo");
    }
}