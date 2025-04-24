public class AlgoritmosF01 {
    public static void main(String[] args) {
        // String guarda todos los resultados en respuesta con ayuda de ""
        String respuesta="";
        // n++ es igual a: n=n+1 que ase que imprima de 1 en 1
        // en cambio n=n+2 imprime de 2 en 2
        for (int n = 1; n <= 15; n++) {

            if (n%3==0 && n%5==0) {
                // += es igual a: =respuesta+
                respuesta +="fizzbuzz ";
            } else if (n%3==0) {
                respuesta +="fizz ";
            } else if (n%5==0) {
                respuesta +="buzz ";
            } else {
                respuesta +=n+" ";
            }
        }
        System.out.println(respuesta);
    }
}