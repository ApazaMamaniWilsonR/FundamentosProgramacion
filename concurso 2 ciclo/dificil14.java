/*
* Crea una función que calcule el punto de encuentro de dos objetos en movimiento en
dos dimensiones.
- Cada objeto está compuesto por una coordenada xy y una velocidad de
desplazamiento (vector de desplazamiento) por unidad de tiempo (también en formato
xy).
- La función recibirá las coordenadas de inicio de ambos objetos y sus velocidades.
- La función calculará y mostrará el punto en el que se encuentran y el tiempo que
tardaran en lograrlo.
- La función debe tener en cuenta que los objetos pueden no llegar a encontrarse
*/
import javax.swing.JOptionPane;

public class dificil14 {
    public static void main(String[] args) {
        // Pedir datos del primer objeto
        double x1 = Double.parseDouble(JOptionPane.showInputDialog("Coordenada x del objeto 1:"));
        double y1 = Double.parseDouble(JOptionPane.showInputDialog("Coordenada y del objeto 1:"));
        double vx1 = Double.parseDouble(JOptionPane.showInputDialog("Velocidad x del objeto 1:"));
        double vy1 = Double.parseDouble(JOptionPane.showInputDialog("Velocidad y del objeto 1:"));
        
        // Pedir datos del segundo objeto
        double x2 = Double.parseDouble(JOptionPane.showInputDialog("Coordenada x del objeto 2:"));
        double y2 = Double.parseDouble(JOptionPane.showInputDialog("Coordenada y del objeto 2:"));
        double vx2 = Double.parseDouble(JOptionPane.showInputDialog("Velocidad x del objeto 2:"));
        double vy2 = Double.parseDouble(JOptionPane.showInputDialog("Velocidad y del objeto 2:"));
        
        // Calcular el tiempo de encuentro
        double tiempo = 0;
        boolean seEncuentran = false;
        
        // Verificar si hay solución para el tiempo
        if (vx1 != vx2) {
            tiempo = (x2 - x1) / (vx1 - vx2);
        } else if (vy1 != vy2) {
            tiempo = (y2 - y1) / (vy1 - vy2);
        } else {
            // Mismas velocidades - solo se encuentran si ya están en el mismo punto
            if (x1 == x2 && y1 == y2) {
                tiempo = 0;
                seEncuentran = true;
            }
        }
        
        // Verificar que el tiempo sea positivo y consistente
        if (tiempo >= 0 && !seEncuentran) {
            // Calcular posiciones en ese tiempo
            double px1 = x1 + vx1 * tiempo;
            double py1 = y1 + vy1 * tiempo;
            double px2 = x2 + vx2 * tiempo;
            double py2 = y2 + vy2 * tiempo;
            
            // Verificar si realmente se encuentran
            if (Math.abs(px1 - px2) < 0.0001 && Math.abs(py1 - py2) < 0.0001) {
                seEncuentran = true;
            }
        }
        
        // Mostrar resultados
        if (seEncuentran && tiempo >= 0) {
            double puntoX = x1 + vx1 * tiempo;
            double puntoY = y1 + vy1 * tiempo;
            
            String mensaje = String.format("Los objetos se encuentran en:\n" +
                                         "Coordenadas: (%.2f, %.2f)\n" +
                                         "Tiempo: %.2f unidades de tiempo", 
                                         puntoX, puntoY, tiempo);
            JOptionPane.showMessageDialog(null, mensaje);
        } else {
            JOptionPane.showMessageDialog(null, "Los objetos no se encuentran");
        }
    }
}
