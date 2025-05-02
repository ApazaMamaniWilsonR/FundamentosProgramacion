public class F07Armstrong {
    public static void main(String[] args) {
        System.out.println(isArmstrong(371));  // true
        System.out.println(isArmstrong(-371)); // false
        System.out.println(isArmstrong(372));  // false
        System.out.println(isArmstrong(0));    // true
    }

    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int n = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, n);
            num /= 10;
        }
        return original == sum;
    }
}
