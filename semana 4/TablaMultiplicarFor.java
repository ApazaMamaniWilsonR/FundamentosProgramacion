import javax.swing.JOptionPane;
public class TablaMultiplicarFor {

    public static void main(String[] args) {
        
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));

        for(int i=1;i<=14;i++){
            int producto=i*n;
            JOptionPane.showMessageDialog(null, n+" x "+i+" = "+producto);
        }
    }
}