//increasing then decreasing order
public class q19 {
    public static void main(String[] args) {

        int arr[] = {7, 3, 1, 8, 5, 2, 6, 4}; // Try with odd or even size
        int n = arr.length;

        // Sorting
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int[] newarr = new int[n];
        int idx = 0;

        int mid = (n + 1) / 2;

        // First half in ascending order
        for (int i = 0; i < mid; i++) {
            newarr[idx++] = arr[i];
        }

        // Second half in descending order
        for (int i = n - 1; i >= mid; i--) {
            newarr[idx++] = arr[i];
        }

        // Print result
        for (int i = 0; i < n; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
}