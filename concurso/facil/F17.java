public class F17 {
    public static void main(String[] args) {
        System.out.println(binaryToDecimal("00110")); // 6
        System.out.println(binaryToDecimal("01100")); // 12
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(binary.length() - 1 - i) == '1') {
                decimal += Math.pow(2, i);
            }
        }
        return decimal;
    }
}
