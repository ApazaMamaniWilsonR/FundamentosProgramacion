import javax.swing.JOptionPane;
import java.util.Arrays;
public class Examen06 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer número:"));

        int[] numeros = {n1, n2, n3};

        Arrays.sort(numeros);

        JOptionPane.showMessageDialog(null,"Números ordenados: "+numeros[0]+", "+numeros[1]+", "+numeros[2]);
    }
}