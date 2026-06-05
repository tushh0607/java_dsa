public class q22 {

    public static void repeatingElements(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (count > 1 && !alreadyPrinted) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void nonRepeatingElements(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 2, 3, 4, 1, 5 };

        System.out.print("Repeating Elements: ");
        repeatingElements(arr);

        System.out.println();

        System.out.print("Non-Repeating Elements: ");
        nonRepeatingElements(arr);
    }
}