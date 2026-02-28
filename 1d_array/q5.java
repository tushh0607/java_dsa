
//subarray with max sum k;
import java.util.*;
public class q5 {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter size");
    int size=sc.nextInt();
    int[] arr=  new int[size];
    System.out.println("entre the elements");
    for (int i = 0; i < size; i++) {
        arr[i]=sc.nextInt();
    }
    System.out.println("value to search ");
    int k=sc.nextInt();
    System.out.println(subarraySum(arr,k));
}
    
public static int subarraySum(int[] nums, int k){
int count=0;
int n=nums.length;
for (int i = 0; i < n; i++) {
    int sum=0;
    for (int j = i; j < n; j++) {
        sum+=nums[j];
        if(sum == k){
            count++;
        }
    }
}
return count;
}
}