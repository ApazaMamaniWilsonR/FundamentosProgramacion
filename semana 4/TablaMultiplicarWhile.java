import javax.swing.JOptionPane;
public class TablaMultiplicarWhile {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        int i=1;
        while (i<=14){
            int producto=i*n;
            JOptionPane.showMessageDialog(null,n+" x "+i+" = "+producto);
            i++;
        }
    }
}
