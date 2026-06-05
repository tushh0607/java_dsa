public class q25 {
    public static void equilibriumIndex(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int leftSum = 0;
            int rightSum = 0;

            // Left sum
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            // Right sum
            for (int j = i + 1; j < n; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum) {
                System.out.println("Equilibrium Index = " + i);
                return;
            }
        }

        System.out.println("No Equilibrium Index");
    }

    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 2, 2};

        equilibriumIndex(arr);
    } 
}
