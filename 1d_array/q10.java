//rotate the array by k position 
public class q10 {

    // Method to reverse array
    static void reverse(int[] arr, int start, int end) {
        int n = arr.length;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
       
    }

    // Left Shift using reversal
    static void leftShift(int[] arr, int shift) {
        int n=arr.length;
        shift=shift%n;
        reverse(arr, 0, shift-1);
        reverse(arr, shift, n-1);
        reverse(arr, 0, n-1);
        System.out.println("left wala shift");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }

    // Right Shift using reversal
    static void rightShift(int[] arr, int shift) {
        int n=arr.length;
        shift=shift%n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, shift-1);
        reverse(arr, shift, n-1);
        System.out.println("right wala shift");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

        int shift = 2;

        leftShift(arr1, shift);

        rightShift(arr2, shift);
    }
}