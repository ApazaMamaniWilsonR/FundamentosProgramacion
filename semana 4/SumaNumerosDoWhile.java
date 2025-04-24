import javax.swing.JOptionPane;
public class SumaNumerosDoWhile {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        int m=0;
        int i=1;
        do {
            m=m+i;
            i++;
            
        }while (i<=n);
        JOptionPane.showMessageDialog(null,"la suma de todos los numeros es:"+m);
    }
}