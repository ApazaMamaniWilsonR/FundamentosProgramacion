/*Determinar si un alumno aprueba o reprueba un curso sabiendo que aprobara si su promedio de 
tres calificaciones es mayor o igual a 17; reprueba en caso contrario.
*/
import javax.swing.JOptionPane;
public class F28Promedio {
    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("IIngrese la primera nota:"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("IIngrese la segunda nota:"));
        int n3=Integer.parseInt(JOptionPane.showInputDialog("IIngrese la tercera nota:"));

        double promedio = (n1+n2+n3)/3;
        if (promedio>=17) {
            System.out.println("Aprobado con "+promedio);
        } else {
            System.out.println("Reprobado con "+promedio);
        }
    }
}