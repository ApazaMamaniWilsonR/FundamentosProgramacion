public class F18 {
    public static void main(String[] args) {
        numberOfBoomerangs(new int[]{2, 1, 2, 3, 3, 4, 2, 4});
    }

    public static void numberOfBoomerangs(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i + 2] && arr[i] != arr[i + 1]) {
                System.out.println(arr[i] + ", " + arr[i + 1] + ", " + arr[i + 2]);
            }
        }
    }
}
