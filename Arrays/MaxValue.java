public class MaxValue {
    public static void main(String[] args) {
        int[] arr = { 50, 10, 40, 60, 20 };
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        // max = Math.max(max,value);

        System.out.println("Max value is: " + max);
    }
}