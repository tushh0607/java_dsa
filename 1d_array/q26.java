public class q26 {

    public static void isSubset(int[] arr1, int[] arr2) {

        boolean subset = true;

        for (int i = 0; i < arr2.length; i++) {

            boolean found = false;

            for (int j = 0; j < arr1.length; j++) {

                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                subset = false;
                break;
            }
        }

        if (subset) {
            System.out.println("Subset");
        } else {
            System.out.println("Not a Subset");
        }
    }

    public static void main(String[] args) {

        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 2, 4, 5 };

        isSubset(arr1, arr2);
    }
}