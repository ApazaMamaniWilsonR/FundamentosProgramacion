/*Ingresar 4 notas de un alumno y mostrar la mejor nota.
*/
import java.util.Arrays;
import javax.swing.JOptionPane;
public class F27MejorNota {
    public static void main(String[] args) {
        int[] n=new int[4];
        for (int i = 0; i < n.length; i++) {
            n[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la "+(i+1)+" nota:"));
        }
        Arrays.sort(n);
            System.out.println("La nota mayor es "+n[3]);
    }
}