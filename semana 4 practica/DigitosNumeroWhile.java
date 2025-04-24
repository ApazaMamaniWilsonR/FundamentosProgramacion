import javax.swing.JOptionPane;

public class DigitosNumeroWhile {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        int digitos=0;
        while (n>0) {
            digitos++;
            n=n/10;
        }
        JOptionPane.showMessageDialog(null,digitos+" digitos");
    }
}