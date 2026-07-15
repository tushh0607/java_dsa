class Solution {
    public int gcdOfOddEvenSums(int n) {
    int sumofodd=0;
    int sumofeven=0;
    for(int i=1;i<=2*n-1;i=i+2){
        sumofodd+=i;
    }
    for(int i=2;i<=2*n;i=i+2){
        sumofeven+=i;
    }
    int a=sumofodd;
    int b=sumofeven;
    while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
    }
    return a;
    }
}