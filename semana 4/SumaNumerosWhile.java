import javax.swing.JOptionPane;
public class SumaNumerosWhile {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        int m=0;
        int i=1;
        while (i<=n){
            m=m+i;
            i++;
            
        }JOptionPane.showMessageDialog(null,"la suma de todos los numeros es:"+m);
    }
}