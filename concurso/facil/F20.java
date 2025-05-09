/* Dada una URL con parámetros, crea una función que obtenga sus valores.
No se pueden usar operaciones del lenguaje que realicen esta tarea directamente.
*Ejemplo: En la url https://retosdeprogramacion.com?year=2023&challenge=0
los parámetros serían ["2023", "0"]
*/
import java.util.*;

public class F20 {
    public static void main(String[] args) {
        String url = "https://concursodeprogramacion.com?year=2024&challenge=0&language=java";
        System.out.println(getParameters(url));  // [2024, 0, java]
    }

    public static List<String> getParameters(String url) {
        List<String> parameters = new ArrayList<>();
        
        // Extraer la parte después del "?"
        int questionMarkIndex = url.indexOf('?');
        if (questionMarkIndex != -1) {
            String params = url.substring(questionMarkIndex + 1);
            String[] pairs = params.split("&");

            // Separar los valores por '=' y agregar a la lista
            for (String pair : pairs) {
                String[] keyValue = pair.split("=");
                if (keyValue.length > 1) {
                    parameters.add(keyValue[1]);
                }
            }
        }

        return parameters;
    }
}