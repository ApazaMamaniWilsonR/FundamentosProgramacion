public class F01FizzBuzz {
    public static void main(String[] args) {
        String respuesta="";

        for (int n=1;n<=100;n++) {

            if (n%3==0 && n%5==0) {
                respuesta +="fizzbuzz ";
            } else if (n%3==0) {
                respuesta +="fizz ";
            } else if (n%5==0) {
                respuesta +="buzz ";
            } else {
                respuesta +=n+" ";
            }
        }
        System.out.print(respuesta);
    }
}