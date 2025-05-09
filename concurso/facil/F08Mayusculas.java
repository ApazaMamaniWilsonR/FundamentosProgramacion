public class F08Mayusculas {
    public static void main(String[] args) {
        String texto="concurso de programacion";
        for (int i = 0; i < texto.length(); i++) {
            if (i==0||i==texto.indexOf(" ")+1) {
                String letra=String.valueOf(texto.charAt(i)).toUpperCase();
                System.out.print(letra);
            } else {
                System.out.print(texto.charAt(i));
            }
            
        }
    }
}