public class F05Cadenas {
    public static void printNonCommon(String str1, String str2) {
        StringBuilder out1 = new StringBuilder();
        StringBuilder out2 = new StringBuilder();

        String str1Lower = str1.toLowerCase();
        String str2Lower = str2.toLowerCase();

        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (str2Lower.indexOf(Character.toLowerCase(c)) == -1) {
                out1.append(c);
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if (str1Lower.indexOf(Character.toLowerCase(c)) == -1) {
                out2.append(c);
            }
        }

        System.out.println("out1: " + out1.toString());
        System.out.println("out2: " + out2.toString());
    }

    public static void main(String[] args) {
        printNonCommon("Me gusta Java", "Me gusta Kotlin");
    }
}
