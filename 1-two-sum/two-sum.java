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


//using hashmap
class Solution{
    public int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int idxneed=target-nums[i];
            if(map.containsKey(idxneed)){
                return new int[]{map.get(idxneed),i};
            }
            
            else{
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}