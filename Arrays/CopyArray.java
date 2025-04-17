public class CopyArray {
    public static void main(String[] args) {
        String[] arr = { "Sai", "Veer", "Don" };
        String[] brr = new String[arr.length];

        // copying arr to brr
        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[i];
        }

        // checking brr
        System.out.println(brr[0]);
    }
}
