import javax.swing.JOptionPane;
public class AlgoritmosF02 {
    public static void main(String[] args) {
        // crea un bucle para que con el valor true solo se puede terminar de forma manual
        while (true) {
            
            String f=JOptionPane.showInputDialog("Elija la figura:\n1-triangulo\n2-rectangulo\n3-salir");
            // toLowerCase convierte cualquier mayuscula en minuscula
            switch (f.toLowerCase()) {
                // te da a escoger entre opcion 1 o 2 en este caso 1
                case "1":
                float b=Float.parseFloat(JOptionPane.showInputDialog("ingrese la base:"));
                float a=Float.parseFloat(JOptionPane.showInputDialog("ingrese la altura:"));
                float at=(b*a)/2;
                JOptionPane.showMessageDialog(null, "El area del triangulo es: "+at);
                // termina la operacion
                break;
        
                case "2":
                float l1=Float.parseFloat(JOptionPane.showInputDialog("ingrese el primer lado:"));
                float l2=Float.parseFloat(JOptionPane.showInputDialog("ingrese el segundo lado:"));
                float ar=l1*l2;
                JOptionPane.showMessageDialog(null, "El area del rectangulo es: "+ar);
                break;

                case "3":
                return;
                // si no encuentra ninguna opcion default se ejecuta
                default:
                    JOptionPane.showMessageDialog(null,"error");
           }
        }
    }
}