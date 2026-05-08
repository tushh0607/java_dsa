//remove element

import java.util.Scanner;

public class q6 {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter size");
    int size=sc.nextInt();
    int[] arr=  new int[size];
    System.out.println("entre the elements");
    for (int i = 0; i < size; i++) {
        arr[i]=sc.nextInt();
    }
    System.out.println("enter k");
    int k = sc.nextInt();
System.out.println("the  number of elements after removing the val from the array"+" "+removeElement(arr,k));

}  
public static int removeElement(int[] nums, int val) {
int count=0;
int n=nums.length;
for (int i = 0; i < nums.length; i++) {
    if(nums[i]!=val){
        nums[count]=nums[i];
        count++;
    }
}
return count;
}  
}
