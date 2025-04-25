import javax.swing.JOptionPane;

public class Examen04 {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));
        int m=1;
        for(int i=1;i<=10;i++){
            m=i*n;
            JOptionPane.showMessageDialog(null, n+" x "+i+" = "+m);
        }
        
    }
}