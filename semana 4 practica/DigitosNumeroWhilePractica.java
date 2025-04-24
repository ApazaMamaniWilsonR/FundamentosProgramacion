import javax.swing.JOptionPane;

public class DigitosNumeroWhilePractica {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        int i=0;
        while(0<n){
            i++;
            n=n/10;
        }
        JOptionPane.showMessageDialog(null,i+" digitos.");
    } 
}