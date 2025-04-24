import javax.swing.JOptionPane;
public class FactorialFor {

    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        int factorial=1;
        for(int i=1;i<=n;i++){
        factorial=factorial*i; 
        }
        JOptionPane.showMessageDialog(null,"el factorial es: "+factorial);
    }
}