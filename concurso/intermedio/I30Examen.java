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
        /*Inicio
        Solicitar al usuario el número de respuestas correctas.
        Solicitar al usuario el número de respuestas incorrectas.
        Solicitar al usuario el número de respuestas en blanco.
        Calcular el puntaje de las respuestas correctas: puntoc = correctas × 3
        Calcular el puntaje de las respuestas incorrectas (negativo): puntoi = incorrectas × (-1)
        Calcular el puntaje de las respuestas en blanco: puntob = en blanco × 0
        Calcular el puntaje total: total = puntoc + puntoi + puntob
        Mostrar el puntaje total al usuario.
        Fin */
    }
}