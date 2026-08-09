class Solution {
    public boolean isPalindrome(int x) {
        if(x == reverse(x)){
            return true;
        }
        else{
            return false;
        }
    }
    public int reverse(int x){
        int rev=0;
        while(x>0){
            int ld=x%10;
            rev=rev*10+ld;
            // int numberkochota=x/10;
            x/=10;
            
        }
        return rev;
    }
}