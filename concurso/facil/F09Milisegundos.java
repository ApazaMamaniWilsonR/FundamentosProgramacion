public class F09Milisegundos {
    public static void main(String[] args) {
        System.out.println(timeToMillis(0, 0, 0, 10));           // 10000 milisegundos
        System.out.println(timeToMillis(2, 5, 45, 10));         // 193510000 milisegundos
    }

    public static long timeToMillis(int days, int hours, int minutes, int seconds) {
        return (days * 86400000) + (hours * 3600000) + (minutes * 60000) + (seconds * 1000);
    }
}
