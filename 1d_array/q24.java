//sort according to frequency

public class q24 {

    public static void sortByFrequency(int[] arr) {

        int n = arr.length;

        // Store frequencies
        int freq[] = new int[n];

        for (int i = 0; i < n; i++) {

            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            freq[i] = count;
        }

        // Sort based on frequency
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (freq[i] < freq[j]) {

                    int temp = freq[i];
                    freq[i] = freq[j];
                    freq[j] = temp;

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print unique elements according to frequency
        boolean visited[] = new boolean[n];

        for (int i = 0; i < n; i++) {

            if (visited[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            for (int k = 0; k < count; k++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 1, 2, 2, 2, 3};

        sortByFrequency(arr);
    }
}