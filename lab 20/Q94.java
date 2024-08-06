// slection sort
public class Q94 {
    public static void main(String[] args) {
        int arr[] = {3, 454, 6, 67, 8, 999, 775, 64, 5, 4};
        int pass = arr[0];
        int minIdx = pass;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j <= arr.length-2; j++) {
                if (arr[i] < minIdx) {
                    minIdx = i;
                }
                if (minIdx != pass) {
                    int temp = arr[pass];
                    arr[pass] = arr[minIdx];
                    arr[minIdx] = temp;

                }
            }
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);

        }
    }
}
