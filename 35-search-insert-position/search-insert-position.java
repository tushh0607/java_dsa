// class Solution {
//     public int searchInsert(int[] nums, int target) {
//        int n=nums.length;
//        for(int i=0;i<n;i++){
//         if(nums[i] == target){
//             return i; 
//         }
//         else if(nums[i]>target){
//             return i;
//         }
//        }
//        return n;
//     }
// }

class Solution{
    public int searchInsert(int[] nums,int target){
        int n=nums.length;
        int low=0;
        int high=nums.length;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}