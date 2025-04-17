public class RevOfArray {
    public static void main(String args[]) {
        int[] ages = { 18, 20, 22, 24, 28 };
        for (int i = ages.length - 1; i >= 0; i--) {
            System.out.print(ages[i] + " ");
        }
    }
}