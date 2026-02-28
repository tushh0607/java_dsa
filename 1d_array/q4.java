//merge sorted arrays
public class q4 {
public static void main(String[] args) {
    int[] arr1={1,2,3,4,5};
    int[] arr2={1,2,3,4,5};
    int m=arr1.length;
    int n=arr2.length;
    // System.out.println(merge(arr1, arr2, m, n));
    int[] res = merge(arr1, arr2, m, n);

for (int i=0;i<res.length;i++) {
    System.out.println(res[i]);
}


}
public static int[] merge(int[] ar1,int[] ar2,int m,int n){
    int i=0,j=0,k=0;
    int[] temp= new int[m+n];
    while(i<m && j<n){
        if(ar1[i]<=ar2[j]){
            temp[k++]=ar1[i++];
        }
        else{
            temp[k++]=ar2[j++];
        }
    }
    while(i<m){
        temp[k++]=ar1[i++];
    }
      while(j<n){
        temp[k++]=ar2[j++];
    }
  return temp;
}
    
}