/*
* Crea una función que simule las condiciones climáticas (temperatura y probabilidad de
lluvia) de un lugar ficticio al pasar un número concreto de días según estas reglas:
- La temperatura inicial y el % de probabilidad de lluvia lo define el usuario.
- Cada día que pasa:
- 10% de posibilidades de que la temperatura aumente o disminuya 2 grados.
- Si la temperatura supera los 25 grados, la probabilidad de lluvia al día siguiente
aumenta en un 20%.
- Si la temperatura baja de 5 grados, la probabilidad de lluvia al día
 siguiente disminuya en un 20%.
- Si llueve (100%), la temperatura del día siguiente disminuye en 1 grado.
- La función recibe el número de días de la predicción y muestra la temperatura y si
llueve durante todos esos días.
- También mostrará la temperatura máxima y mínima de ese periodo y cuántos días va a
llover.
*/
import javax.swing.JOptionPane;
import java.util.Random;

public class dificil15 {
    public static void main(String[] args) {
        // Pedir cantidad de días
        String diasStr = JOptionPane.showInputDialog("¿Cuántos días quieres simular?");
        if (diasStr == null || !diasStr.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa un número entero válido.");
            return;
        }
        int dias = Integer.parseInt(diasStr);

        // Pedir temperatura inicial
        String tempStr = JOptionPane.showInputDialog("Temperatura inicial (grados):");
        if (tempStr == null || !tempStr.matches("-?\\d+")) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa una temperatura válida.");
            return;
        }
        int temperatura = Integer.parseInt(tempStr);

        // Pedir probabilidad de lluvia inicial
        String probStr = JOptionPane.showInputDialog("Probabilidad de lluvia inicial (%):");
        if (probStr == null || !probStr.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa un porcentaje válido.");
            return;
        }
        int probLluvia = Integer.parseInt(probStr);

        Random random = new Random();
        int tempMax = temperatura;
        int tempMin = temperatura;
        int diasLluviosos = 0;
        StringBuilder reporte = new StringBuilder("SIMULACIÓN CLIMÁTICA:\n");

        for (int dia = 1; dia <= dias; dia++) {
            reporte.append("\nDía ").append(dia).append(": ");

            // 10% de posibilidad de cambiar la temperatura en ±2 grados
            if (random.nextInt(100) < 10) {
                if (random.nextBoolean()) {
                    temperatura += 2;
                } else {
                    temperatura -= 2;
                }
            }

            // Determinar si llueve
            boolean llueve = random.nextInt(100) < probLluvia;
            if (llueve) {
                reporte.append("LLUEVE, ");
                diasLluviosos++;
                temperatura -= 1; // baja temperatura si llueve
            } else {
                reporte.append("Soleado, ");
            }

            reporte.append(temperatura).append("°C");
            reporte.append(" (Prob. lluvia: ").append(probLluvia).append("%)");

            // Ajustar probabilidad de lluvia según temperatura
            if (temperatura > 25) {
                probLluvia = Math.min(probLluvia + 20, 100);
            } else if (temperatura < 5) {
                probLluvia = Math.max(probLluvia - 20, 0);
            }

            // Actualizar máximas y mínimas
            if (temperatura > tempMax) tempMax = temperatura;
            if (temperatura < tempMin) tempMin = temperatura;
        }

        // Resultados finales
        reporte.append("\n\n--- RESUMEN ---\n");
        reporte.append("Temperatura máxima: ").append(tempMax).append("°C\n");
        reporte.append("Temperatura mínima: ").append(tempMin).append("°C\n");
        reporte.append("Días con lluvia: ").append(diasLluviosos).append(" de ").append(dias);

        JOptionPane.showMessageDialog(null, reporte.toString());
    }
}