/* Crea una función que encuentre todos los triples pitagóricos (ternas) menores o iguales a 
un número dado. Debes buscar información sobre qué es un triple pitagórico. *formula del tiple 
Pitágoras : a^2+b^2=c^2  ---> 3^2+4^2=5^2 --> 9+16 = 25  
- La función únicamente recibe el número máximo que puede aparecer en el triple.
* Ejemplo: Los triples menores o iguales a 10 están formados por (3, 4, 5) y (6, 8, 10).
*/
import javax.swing.JOptionPane;
public class I27Pitagoras {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        triplePitagoricos(n);
    }
    public static void triplePitagoricos(int n) {
        int[] L1={3,6,5,9,8,12};
        int[] L2={4,8,12,12,15,16};
        int[] L3={5,10,13,15,17,20};

        int contador=0;

        for (int i = 0; i < L3.length; i++) {
            if (n>=L3[i]){
                System.out.println("("+L1[i]+" "+L2[i]+" "+L3[i]+")");

                contador++;
            }
        }
        if (contador==0){
            System.out.println("error");
        }
    }
}