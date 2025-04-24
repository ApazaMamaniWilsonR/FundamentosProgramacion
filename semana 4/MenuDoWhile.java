import java.time.LocalDate;

import javax.swing.JOptionPane;
public class MenuDoWhile {
    public static void main(String[] args) {
        String f="";
        do {
            
            f=JOptionPane.showInputDialog("Elija una opcion:\n1 - Saludo\n2 - Fecha\n3- Salir");

            switch (f) {

                case "1":
                JOptionPane.showMessageDialog(null,"hola");
                break;
        
                case "2":
                JOptionPane.showMessageDialog(null,LocalDate.now());
                break;

                case "3":
                break;

                default:
                    JOptionPane.showMessageDialog(null,"error");
           }
        }while (!"3".equals(f));
    }
}