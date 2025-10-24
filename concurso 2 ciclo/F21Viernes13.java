/* Crea una función que sea capaz de detectar si existe un viernes 13 en el mes y el año indicados.
La función recibirá el mes y el año y retornará verdadero o falso.
*/
import java.util.*;

public class F21Viernes13 {
    public static void main(String[] args) {
        System.out.println(friday13(2023,3));
        System.out.println(friday13(2023,1));
        System.out.println(friday13(-2023,1));
    }
    public static boolean friday13(int año,int mes) {
        if (año < 0) return false;
        Calendar calendario= new GregorianCalendar(año,mes-1,13);
        return calendario.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY;
    }
    
}