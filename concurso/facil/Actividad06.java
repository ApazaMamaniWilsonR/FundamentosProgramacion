import javax.swing.JOptionPane;

public class Actividad06 {
    public static void main(String[] args) {
        int clases=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer digito: "));
        int quizziz=Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo digito: "));
        int practica=Integer.parseInt(JOptionPane.showInputDialog("ingrese el tercer digito: "));

        double promedio=(clases*0.3)+(quizziz*0.2)+(practica*0.5);

        if(promedio<=13){
            JOptionPane.showMessageDialog(null,+promedio+" desaprobado");
        }else {
            JOptionPane.showMessageDialog(null, +promedio+" aprobado");
        }


    }
}