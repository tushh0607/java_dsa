//max product subarray 
public class q14 {
        public static void main(String[] args) {
         int[] arr = {2, 3, -2, 4};
            maxprod(arr);
        // int result = maxProd(arr);

        // System.out.println("Maximum Product Subarray = " + result);

    }
    public static void maxprod(int[] arr){
        int  maxprod=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int prod=1;
            for (int j = i; j < n; j++) {
                prod*=arr[j];
                if(prod>maxprod){
                    maxprod=prod;
                }
            }
            
        }
        System.out.println("max prod is "+maxprod);
    }
}
