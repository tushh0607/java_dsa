
// count the freq of each element in an array 
import java.util.HashMap;
import java.util.Map;

public class q8 {

    public static void countFrequencies(int[] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i] == true) {
                continue;
            }
            int count=1;
            for (int j = i+1; j < n; j++) {
                if(arr[i] ==  arr[j]){
                    count++;
                    visited[j] =true;
                }
            }
            System.out.println(arr[i]+" ->"+count);
        }
     
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 20, 10, 10, 20, 5, 20 };
        countFrequencies(arr);
        
    }
}