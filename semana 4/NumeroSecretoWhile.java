import javax.swing.JOptionPane;
public class NumeroSecretoWhile{
    public static void main(String[] args){
        int numeroSecreto = (int)(Math.random()*10+1);
        int n=0;
        while (n!=numeroSecreto){
            n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
            if(n!=numeroSecreto){
                JOptionPane.showMessageDialog(null, "casi");
            }else {
            JOptionPane.showMessageDialog(null, "Acertaste");
            break;
            }
        }
    }
}