public class q16 {
     static void replaceByRank(int[] arr) {

        int n = arr.length;

        // Copy original array
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }

        // Sort temp array
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (temp[i] > temp[j]) {

                    int t = temp[i];
                    temp[i] = temp[j];
                    temp[j] = t;
                }
            }
        }

        // Replace with rank
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (arr[i] == temp[j]) {

                    arr[i] = j + 1;
                    break;
                }
            }
        }

        // Display ranked array
        System.out.println("Array after replacing by rank:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {20, 15, 26, 2, 98, 6};

        replaceByRank(arr);
    }
}
