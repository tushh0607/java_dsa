//we need to find max and sec max in array

import java.util.*;
public class q1 {

    public static int max(int[] array){
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max= array[i];
            }
        }
        
        return max;
    }


    public static int secmax(int[] array){
    int max=max(array);
    for (int i = 0; i < array.length; i++) {
        if (array[i] ==  max) {
            array[i]=Integer.MIN_VALUE;
        }
    }    
    int secmax=max(array);
    return secmax;
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
        System.out.println("max is "+max(arr));
        System.out.println("second max is "+secmax(arr));
    }
}
