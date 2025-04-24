import javax.swing.JOptionPane;

public class Algoritmo01 {

    public static boolean sonAnagramas(String palabra1, String palabra2) {
        // Convertimos a minúsculas
        palabra1 = palabra1.toLowerCase();
        palabra2 = palabra2.toLowerCase();

        // Verificamos longitud
        if (palabra1.length() != palabra2.length()) {
            return false;
        }

        // Contamos las letras de cada palabra
        for (int i = 0; i < palabra1.length(); i++) {
            char letra = palabra1.charAt(i);
            int contador1 = contarCaracter(palabra1, letra);
            int contador2 = contarCaracter(palabra2, letra);
            if (contador1 != contador2) {
                return false;
            }
        }

        return true;
    }

    // Función auxiliar para contar cuántas veces aparece un carácter
    public static int contarCaracter(String palabra, char caracter) {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == caracter) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        String palabra1 = JOptionPane.showInputDialog("Introduce la primera palabra:");
        String palabra2 = JOptionPane.showInputDialog("Introduce la segunda palabra:");

        boolean resultado = sonAnagramas(palabra1, palabra2);

        if (resultado) {
            JOptionPane.showMessageDialog(null, "¡Sí! Son anagramas.");
        } else {
            JOptionPane.showMessageDialog(null, "No, no son anagramas.");
        }
    }
}