import javax.swing.JOptionPane;

public class Algoritmo02 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        boolean esPrimo = true;

        if (n <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            JOptionPane.showMessageDialog(null, n + " es un número primo.");
        } else {
            JOptionPane.showMessageDialog(null, n + " no es un número primo.");
        }
    }
}
