// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]+nums[j] ==  target){
//                   return   new int[]{i,j};
//                 }
//             }
//         } 
//         return new int[]{-1,-1}; // if not found then return
//     }
// }
class Solution{
 public int[] twoSum(int[] nums, int target){
    int n=nums.length;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(nums[i]+nums[j] == target){
                return new int[]{i,j};
            }

        }
    }
    return new int[]{-1,-1};

 }

}