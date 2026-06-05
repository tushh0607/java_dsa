//plus one wala ques 

public class q21 {
    public static void main(String[] args) {

        int arr[] = {9, 9, 9};//output will be 1,0,0,0

        int[] result = plusOne(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] plusOne(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            else{
                digits[i]=0;
            }
        }
        int[] newarr= new int[digits.length+1];
        newarr[0]=1;
        return newarr;
    }
}
