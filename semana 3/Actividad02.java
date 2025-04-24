import javax.swing.JOptionPane;

public class Actividad02 {
    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero 1: "));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero 2: "));
        
        if (n1>n2) {
            JOptionPane.showMessageDialog(null,"El mayor es: "+n1);
        }else if(n2<n1){
            JOptionPane.showMessageDialog(null,"El mayor es: "+n2);
        }else{
            JOptionPane.showMessageDialog(null," son iguales: ");
        }
    }
}