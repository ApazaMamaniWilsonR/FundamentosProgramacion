/* Se necesita elaborar un algoritmo que solicite el número de respuestas correctas, incorrectas 
y en blanco, correspondientes a postulantes, y muestre su puntaje final considerando 
que por cada respuesta correcta tendrá 3 puntos, respuestas incorrectas tendrá -1 y respuestas en 
blanco tendrá 0.
*/
import javax.swing.JOptionPane;
public class I30Examen {
    public static void main(String[] args) {
        int c=Integer.parseInt(JOptionPane.showInputDialog("ingrese las respuestas correctas: "));
        int i=Integer.parseInt(JOptionPane.showInputDialog("ingrese las respuestas incorrectas: "));
        int b=Integer.parseInt(JOptionPane.showInputDialog("ingrese las respuestas en blanco: "));

        int puntoc=c*3;
        int puntoi=i*-1;
        int puntob=b*0;

        int total=puntoc+puntoi+puntob;
        JOptionPane.showMessageDialog(null, "su nota es: "+total);
    }
}