
//finding the median of array
public class q11 {

    // Method to sort array
    static void sortArray(int[] arr) {

        int temp;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Method to find median
    static void findMedian(int[] arr) {

       sortArray(arr);
       int n=arr.length;
       if(n%2==1){
        System.out.println(arr[n/2]);
       }
       else{
        System.out.println((arr[n/2]+arr[n/2-1])/2);
       }

    }

    public static void main(String[] args) {

        int[] arr = {7, 2, 1, 6, 5, 3};
        findMedian(arr);
        


    }
}