/*
* Crea una función que reciba dos parámetros para crear una cuenta atrás.
- El primero, representa el número en el que comienza la cuenta.
- El segundo, los segundos que tienen que transcurrir entre cada cuenta.
- Sólo se aceptan números enteros positivos.
- El programa finaliza al llegar a cero.
- Debes imprimir cada número de la cuenta atrás.
*/
import javax.swing.JOptionPane;

public class dificil12 {
    
    public static void main(String[] args) throws InterruptedException {
        try {
            int inicio = Integer.parseInt(JOptionPane.showInputDialog("Número para iniciar la cuenta atrás:"));
            int pausa = Integer.parseInt(JOptionPane.showInputDialog("Segundos entre cada número:"));

            if (inicio <= 0 || pausa <= 0) {
                JOptionPane.showMessageDialog(null, "Ambos valores deben ser mayores que cero.");
                return;
            }
            
            for (int i = inicio; i >= 0; i--) {
                System.out.println(i);
                Thread.sleep(pausa * 1000);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa solo números enteros.");
        } 
    }
}