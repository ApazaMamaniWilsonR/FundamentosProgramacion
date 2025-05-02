public class F08Mayusculas {
    public static void main(String[] args) {
        System.out.println(capitalLetter("concurso de programacion"));  // RPTA: Concurso De Programacion
    }

    // Función que pone en mayúscula la primera letra de cada palabra
    public static String capitalLetter(String str) {
        StringBuilder result = new StringBuilder();
        boolean isStartOfWord = true;  // Indica si estamos en el inicio de una palabra

        // Recorremos cada carácter de la cadena
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Si estamos al inicio de una palabra, ponemos la letra en mayúscula
            if (isStartOfWord && currentChar != ' ') {
                result.append(Character.toUpperCase(currentChar));
                isStartOfWord = false;  // Ya no estamos en el inicio de la palabra
            } 
            // Si el carácter es un espacio, lo agregamos y marcamos el inicio de la siguiente palabra
            else if (currentChar == ' ') {
                result.append(currentChar);
                isStartOfWord = true;
            } 
            // Si no es el inicio de una palabra, simplemente agregamos el carácter tal cual
            else {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}