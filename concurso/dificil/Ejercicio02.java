import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ejercicio02 {
    public static void main(String[] args) {
        long dias=calcularDias("23/05/2025", "12/05/2025");
        System.out.println("la cantidad de dias es: "+dias);
    }
    public static long calcularDias(String fecha1,String fecha2) {
        String[] a1=fecha1.split("/");
        String[] a2=fecha2.split("/");
        LocalDate date1=LocalDate.of(Integer.parseInt(a1[2]),Integer.parseInt(a1[1]),Integer.parseInt(a1[0]));
        LocalDate date2=LocalDate.of(Integer.parseInt(a2[2]),Integer.parseInt(a2[1]),Integer.parseInt(a2[0]));
        long dias=ChronoUnit.DAYS.between(date2,date1);
        return dias;
    }
}