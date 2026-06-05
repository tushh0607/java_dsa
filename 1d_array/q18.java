//count freq of each element
public class q18 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 1, 4, 2};
    int n=arr.length;
    boolean[] newarr= new boolean[n];
    for (int i = 0; i < n; i++) {
        if (newarr[i] ==  true) {
            continue;
        }
        int count=1;
        for (int j = i+1; j < n; j++) {
            if(arr[i] == arr[j]){
                count++;
                newarr[j]=true;
            }
        }
        System.out.println(arr[i]+ "->"+ count);
    }
    }
}
