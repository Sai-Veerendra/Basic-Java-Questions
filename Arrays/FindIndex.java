public class FindIndex {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 10, 20, 7, 18, 30 };
        int element = 18;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("Index of the element is: " + i);
            }
        }

        // java.util.Arrays -> Arrays.asList(arr).indexOf(18);
    }
}
