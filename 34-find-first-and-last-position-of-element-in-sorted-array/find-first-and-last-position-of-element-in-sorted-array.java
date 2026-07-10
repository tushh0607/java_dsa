class Solution {
    public int[] searchRange(int[] nums, int target) {
     int n=nums.length;
     int first=-1,last=-1;
     for(int i=0;i<n;i++){
        if(nums[i] == target&&(i==0 || nums[i-1]!=target)){
            first=i;
        }
        if(nums[i] == target&&(i==n-1 || nums[i+1]!=target)){
            last=i;
        }
     } 
     return new int[]{first,last};  
    }
}