/* Crea un programa que realize el cifrado César de un texto y lo imprima. También debe ser 
capaz de descifrarlo cuando así se lo indiquemos.
Te recomiendo que busques información para conocer en profundidad cómo realizar el cifrado. 
Esto también forma parte del reto.
*/
public class I23CesarÑ {
    public static void main(String[] args) {

        String letra1="Mi nombre es MoureDev.";
        String letra2="ol proeuh hv orxuhghy.";
        avanzar(letra1);
        retrocede(letra2);   
    }
    public static void avanzar(String letra) {
        String m = "abcdefghijklmnñopqrstuvwxyz";
        String resultado="";
        for (int i = 0; i < letra.length(); i++) {
            char cesar=letra.toLowerCase().charAt(i);
            if (m.indexOf(cesar)!=-1) {
                int encontrar=(m.indexOf(cesar)+3)%27;
                cesar=m.charAt(encontrar);
            }
            resultado+=cesar;
        }
        System.out.println(resultado);
    }
    public static void retrocede(String letra) {
        String m = "abcdefghijklmnñopqrstuvwxyz";
        String resultado="";
        for (int i = 0; i < letra.length(); i++) {
            char cesar=letra.toLowerCase().charAt(i);
            if (m.indexOf(cesar)!=-1) {
                int encontrar=(m.indexOf(cesar)-3+27)%27;
                cesar=m.charAt(encontrar);
            }
            resultado+=cesar;
        }
        System.out.println(resultado);
    }
}