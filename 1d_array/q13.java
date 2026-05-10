
//find the symmetric pairs
public class q13 {
    public static void main(String[] args) {
          int[][] arr = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};  // Example input
          findSymmetricPairs(arr);

    }
    public static void findSymmetricPairs(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j][0]==arr[i][1] && arr[j][1]==arr[i][0]){
                    System.out.println("(" + arr[i][1] + " " + arr[i][0] + ") ");
                }
            }
        }
    }
}
