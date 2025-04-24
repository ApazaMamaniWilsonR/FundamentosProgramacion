import javax.swing.JOptionPane;
public class TablaMultiplicarDoWhile {
    public static void main(String[] args) {

        int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        int i=1;

        do {
            i++;
            int producto=i*n;
            System.out.println(n+" x "+i+" = "+producto);
        }while (i<=14);
    }
}