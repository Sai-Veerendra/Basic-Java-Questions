public class ArrayAvg {
    public static void main(String[] args) {
        double[] arr = { 10.5, 20.3, 30.4, 40.3, 50.5 };
        double sum = arr[0];
        int lengthOfArr = arr.length;

        for (int i = 1; i < lengthOfArr; i++) {
            sum += arr[i];
        }

        System.out.println("Avg of array is : " + (sum / lengthOfArr));
    }
}
