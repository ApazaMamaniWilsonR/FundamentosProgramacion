/* Crea una función que reciba días, horas, minutos y segundos (como enteros) y retorne su resultado 
en milisegundos.
*/
public class F09Milisegundos {
    public static long timeToMillis(int days, int hours, int minutes, int seconds) {
        return (days * 86400000) + (hours * 3600000) + (minutes * 60000) + (seconds * 1000);
    }
    public static void main(String[] args) {
        System.out.println(timeToMillis(0, 0, 0, 10));
        System.out.println(timeToMillis(2, 5, 45, 10));
    }
}