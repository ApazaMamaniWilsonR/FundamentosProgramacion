/*Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del 
lenguaje que lo hagan de forma automática.
- Si le pasamos "Hola mundo" nos retornaría "odnum aloH".
*/
import javax.swing.JOptionPane;
public class F03Contrario {
    public static String textoiIvertido(String texto) {
        
        String invertido="";
        for(int i=texto.length()-1;i>=0;i--){
            invertido+=texto.charAt(i);
        }
        return invertido;
    }
    public static void main(String[] args) {

        String texto=JOptionPane.showInputDialog("ingrese el texto");
        String invertido=textoiIvertido(texto);
        JOptionPane.showMessageDialog(null,"El texto es: "+texto);;
        JOptionPane.showMessageDialog(null,"El texto invertido es: "+invertido);;
    }
}