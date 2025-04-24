import javax.swing.JOptionPane;

public class InvertirNumeroPractica {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));
        int i;
        for(i=0;n!=0;n/=10){
            i=i*10+n%10;
        }
        JOptionPane.showMessageDialog(null, "El numero invertido es: "+i);
    }
}