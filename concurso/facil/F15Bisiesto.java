/* Crea una función que imprima los 30 próximos años bisiestos siguientes a uno dado.
Utiliza el menor número de líneas para resolver el ejercicio.
*/
public class F15Bisiesto {
    public static void thirtyLeapYears(int bisiesto) {
        int count = 0;
        while (count < 30) {
            if (bisiesto%4==0 && bisiesto%100!=0||bisiesto%400==0) {
                System.out.print(bisiesto + " ");
                count++;
            }
            bisiesto++;
        }
    }
    public static void main(String[] args) {
        thirtyLeapYears(1999);
    }
}