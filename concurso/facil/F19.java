import java.util.*;

public class F19 {
    public static void main(String[] args) {
        System.out.println(mostRepeatedVowel("Contraataque"));  // [a]
        System.out.println(mostRepeatedVowel("Reemplazar"));    // [a, e]
        System.out.println(mostRepeatedVowel("brp qyz"));        // []
    }

    public static List<String> mostRepeatedVowel(String text) {
        text = text.toLowerCase();  // Convertir todo a minúsculas para evitar problemas de comparación
        Map<Character, Integer> vowelCount = new HashMap<>();
        List<String> result = new ArrayList<>();

        // Contar las vocales
        for (char c : text.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vowelCount.put(c, vowelCount.getOrDefault(c, 0) + 1);
            }
        }

        // Encontrar la o las vocales más repetidas
        int maxCount = 0;
        for (int count : vowelCount.values()) {
            maxCount = Math.max(maxCount, count);
        }

        // Agregar las vocales que tienen el máximo conteo
        for (Map.Entry<Character, Integer> entry : vowelCount.entrySet()) {
            if (entry.getValue() == maxCount) {
                result.add(String.valueOf(entry.getKey()));
            }
        }

        return result;
    }
}
