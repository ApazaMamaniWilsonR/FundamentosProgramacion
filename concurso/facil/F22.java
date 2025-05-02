public class F22 {
    public static void main(String[] args) {
        toOctalAndHex(100);
    }

    public static void toOctalAndHex(int number) {
        System.out.println(number + " en octal es " + Integer.toOctalString(number));
        System.out.println(number + " en hexadecimal es " + Integer.toHexString(number));
    }
}
