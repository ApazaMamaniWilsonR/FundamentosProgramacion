/* Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas hay en el curso actual.
Diseñar un algoritmo para este propósito
(recuerda que para calcular el porcentaje puedes hacer una regla de 3).
*/
import javax.swing.JOptionPane;
public class F24Porcentaje {
    public static void main(String[] args) {
        int niños=Integer.parseInt(JOptionPane.showInputDialog("ingresar cantidad de niños: "));
        int niñas=Integer.parseInt(JOptionPane.showInputDialog("ingresar cantidad de niñas: "));

        int total = niños + niñas;
        double porcentaje1=niños*100/total;
        double porcentaje2=niñas*100/total;

        System.out.println("Porcentaje niños: "+porcentaje1+"%"+"\nPorcentaje niñas: "+porcentaje2+"%");
    }
}