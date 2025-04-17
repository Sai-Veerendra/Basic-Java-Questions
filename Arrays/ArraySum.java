public class ArraySum {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 25, 35, 10 };
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum is : " + sum);
    }
}
