/* Una persona enferma, que pesa 70 kg, se encuentra en reposo y desea saber cuántas calorías 
consume su cuerpo durante todo el tiempo <-- Desea saber cuantas calorias consume su cuerpo que 
realice una misma actividad. Las actividades que tiene permitido realizar son únicamente dormir 
o estar sentado en reposo. Los datos que tiene son que estando dormido consume 1.08 calorías por 
minuto y estando sentado en reposo consume 1.66 calorías por minuto.
*/
import javax.swing.JOptionPane;
public class I24Calorias {
    public static void main(String[] args) {
        int selecciona=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero\ndormir: 1\nsentar: 2"));
        switch (selecciona) {
            case 1:
                int m1=Integer.parseInt(JOptionPane.showInputDialog("ingrese los minutos durmiendo"));
                double tiempo1=m1*1.08;
                System.out.println("Quemaras "+tiempo1+" calorias en "+m1+" minutos.");
                break;
            case 2:
                int m2=Integer.parseInt(JOptionPane.showInputDialog("ingrese los minutos sentado"));
                double tiempo2=m2*1.66;
                System.out.println("Quemaras "+tiempo2+" calorias en "+m2+" minutos.");
                break;
            default:
                System.out.println("chistosito");
                break;
        }
    }
}