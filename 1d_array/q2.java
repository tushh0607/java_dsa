//to find the array is sorted or not 

import java.util.*;
public class q2 {

    public static boolean issorted(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] > array[i+1]){
                return false;
                
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter size:");
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        if (issorted(arr)) {
            System.out.println("sorted");
        }
        else{
            System.out.println("not sorted");
        }
    }
}
