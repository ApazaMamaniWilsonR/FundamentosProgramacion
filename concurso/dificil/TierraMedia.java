import javax.swing.JOptionPane;

public class TierraMedia {
    public static void main(String[] args) {
        // Arrays con los valores por raza
        int[] bondadosas = {1, 2, 3, 4, 5}; // Pelosos, Sureños buenos, Enanos, Númenóreanos, Elfos
        int[] malvadas =   {2, 2, 2, 3, 5}; // Sureños malos, Orcos, Goblins, Huargos, Trolls

        String[] nombresBondadosas = {
            "Pelosos", "Sureños buenos", "Enanos", "Númenóreanos", "Elfos"
        };

        String[] nombresMalvadas = {
            "Sureños malos", "Orcos", "Goblins", "Huargos", "Trolls"
        };

        int fuerzaBien = 0;
        int fuerzaMal = 0;

        // Input para razas bondadosas
        for (int i = 0; i < bondadosas.length; i++) {
            String input = JOptionPane.showInputDialog(
                "Ingrese la cantidad de " + nombresBondadosas[i] + " (bien):"
            );
            int cantidad = Integer.parseInt(input);
            fuerzaBien += cantidad * bondadosas[i];
        }

        // Input para razas malvadas
        for (int i = 0; i < malvadas.length; i++) {
            String input = JOptionPane.showInputDialog(
                "Ingrese la cantidad de " + nombresMalvadas[i] + " (mal):"
            );
            int cantidad = Integer.parseInt(input);
            fuerzaMal += cantidad * malvadas[i];
        }

        // Mostrar resultados
        String mensajeResultado = "Fuerza del Bien: " + fuerzaBien + "\n" +
                                  "Fuerza del Mal: " + fuerzaMal + "\n";

        if (fuerzaBien > fuerzaMal) {
            mensajeResultado += "¡El Bien ha triunfado!";
        } else if (fuerzaMal > fuerzaBien) {
            mensajeResultado += "¡El Mal ha conquistado la Tierra Media!";
        } else {
            mensajeResultado += "¡Es un empate épico!";
        }

        JOptionPane.showMessageDialog(null, mensajeResultado);
    }
}
