/*  
* Crea un programa que detecte cuando el famoso "Código Konami" se ha introducido
correctamente desde el teclado.
* Si sucede esto, debe notificarse mostrando un mensaje en la terminal.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

public class dificil11 {
    public static void main(String[] args) {
        List<String> konami = Arrays.asList("arriba","arriba","abajo","abajo","izquierda","derecha","izquierda","derecha","b","a");
        List<String> entrada = new ArrayList<>();
        
        JOptionPane.showMessageDialog(null, "Introduce las teclas del Código Konami, una por una:");
        
        for (int i = 0; i < konami.size(); i++) {
            String tecla = JOptionPane.showInputDialog("Tecla " + (i + 1) + ": ");
            
            if (tecla == null) {
                JOptionPane.showMessageDialog(null, "Entrada cancelada.");
                return;
            }
            
            entrada.add(tecla.toLowerCase());
        }
        
        if (entrada.equals(konami)) {
            JOptionPane.showMessageDialog(null, "¡Código Konami detectado! ");
        } else {
            JOptionPane.showMessageDialog(null, "Código incorrecto.");
        }
    }
}