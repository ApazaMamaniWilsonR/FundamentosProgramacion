import javax.swing.JOptionPane;
import java.util.Arrays;
public class Examen08 {
    public static void main(String[] args) {

        int[]numeros=new int[10];

        for (int i=0;i<10;i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero: "+(i+1)));
        }
        Arrays.sort(numeros);
        JOptionPane.showMessageDialog(null,"Números ordenados: "+numeros[0]+" y "+numeros[9]);
    }
}