import javax.swing.JOptionPane;
import java.util.Arrays;
public class PromediosClase {
    public static void main(String[] args) {
        int[] nota=new int[10];
        int suma=0;
        for (int i=0;i<nota.length;i++){
            nota[i] = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero: "+(i+1)));
            suma=suma+nota[i];
        }
        double promedio=suma/nota.length;
        JOptionPane.showMessageDialog(null,"notas"+Arrays.toString(nota)+"\ny el promedio es:"+promedio);
    }
}