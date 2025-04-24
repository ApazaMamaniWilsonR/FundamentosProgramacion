import javax.swing.JOptionPane;
public class Ejercicio17 {
    public static void main(String[] args) {
        int h=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de hombres:"));
        int m=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de mujeres:"));

        int suma=h+m;
        int v=(h*100)/suma;
        int d=(m*100)/suma;

        JOptionPane.showMessageDialog(null,"Hay: "+v+"% hombres y "+d+"% mujeres.");
    }
}