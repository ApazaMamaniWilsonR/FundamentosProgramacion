/* Escribe un programa que calcule la distancia recorrida por un objeto en Movimiento Rectilíneo 
Uniforme (MRU) a partir de su velocidad inicial, velocidad final y el tiempo de desplazamiento. 
El programa debe solicitar al usuario estos valores, validar que el tiempo sea mayor a cero, 
y luego calcular la velocidad promedio (promedio entre la velocidad inicial y final) y la distancia 
recorrida multiplicando la velocidad promedio por el tiempo. Finalmente, muestra los resultados en 
pantalla, incluyendo la velocidad inicial, velocidad final, velocidad promedio, tiempo de 
desplazamiento y la distancia recorrida.
*/
import javax.swing.JOptionPane;

public class I29MRU {
    public static void main(String[] args) {
        double vi=Double.parseDouble(JOptionPane.showInputDialog("ingrese la velocidad inicial"));
        double vf=Double.parseDouble(JOptionPane.showInputDialog("ingrese la velocidad final"));
        double t=Double.parseDouble(JOptionPane.showInputDialog("ingrese la tiempo"));

        if (t<1){
            System.out.println("error");
        }else{
            double vp=(vi+vf)/2;
            double d=vp*t;
            System.out.println("Velocidad inicial: "+vi+" m/s");
            System.out.println("Velocidad final: "+vf+" m/s");
            System.out.println("Velocidad promedio: "+vp+" m/s");
            System.out.println("Tiempo de recorrido: "+t+" m/s");
            System.out.println("Distancia recorrida: "+d+" m/s");

        }
    }
}