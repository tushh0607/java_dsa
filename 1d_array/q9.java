public class q9 {
    public static void main(String[] args) {
        int arr[]={1,3,2,10,20,5};
        arrange(arr);
        }
        public static void arrange(int[] arr){
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    if(arr[i]>arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }

            System.out.println("the sorted array is ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            int mid =n/2;
            System.out.println("first half");
            for (int i = 0; i < mid; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            System.out.println("sec half");
            for (int i = n-1; i >=mid; i--) {
                System.out.print(arr[i]+" ");
            }
        }
    }
