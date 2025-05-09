public class F19VocalRepetida {
    public static void main(String[] args) {
        System.out.println(vocalmasrepetida("Contraataque"));
        System.out.println(vocalmasrepetida("Reemplazar"));
        System.out.println(vocalmasrepetida("brp qyz"));
    }
    public static String vocalmasrepetida(String text) {
        text = text.toLowerCase();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int[] counts = new int[5];

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            for (int j = 0; j < vowels.length; j++) {
                if (c == vowels[j]) {
                    counts[j]++;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > max) {
                max = counts[i];
            }
        }
        String result = "";
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == max && max > 0) {
                result += vowels[i];
            }
        }
        return result.equals("") ? "No hay vocales" : result;
    }
}