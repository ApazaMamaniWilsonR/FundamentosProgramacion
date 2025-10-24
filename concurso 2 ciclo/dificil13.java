/* 
* Crea una función que reciba una expresión matemática (String) y compruebe si es
correcta. Retornará true o false.
- Para que una expresión matemática sea correcta debe poseer un número, una
operación y otro número separados por espacios. Tantos números y operaciones como
queramos.
- Números positivos, negativos, enteros o decimales.
- Operaciones soportadas: + - * / %
 * Ejemplos:
 "5 + 6 / 7 - 4" -> true
 "5 a 6" -> false
*/
import javax.swing.JOptionPane;

public class dificil13 {
    public static void main(String[] args) {
        String expresion = JOptionPane.showInputDialog("Ingresa una expresión matemática:");
        
        String[] elementos = expresion.split(" ");
        
        if (elementos.length % 2 == 0) {
            JOptionPane.showMessageDialog(null, "false");
            return;
        }
        
        String patronNumero = "-?\\d+(\\.\\d+)?";
        String patronOperacion = "[+\\-*/%]";
        boolean valida = true;
        
        for (int i = 0; i < elementos.length; i++) {
            String elemento = elementos[i];
            
            if (i % 2 == 0) {
                if (!elemento.matches(patronNumero)) {
                    valida = false;
                    break;
                }
            } else {
                if (!elemento.matches(patronOperacion)) {
                    valida = false;
                    break;
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, valida);
    }
}
