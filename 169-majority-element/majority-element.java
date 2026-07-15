// class Solution {
//     public int majorityElement(int[] nums) {
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//             int count=0;
//             for(int j=0;j<n;j++){
//                 if(nums[i] == nums[j]){
//                     count++;
//                 }
//             }
//             if(count>Math.floor(n/2)){
//                 return nums[i];
//             }
//         }
//         return -1;
//     }
// }

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
            if(map.get(nums[i])>nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }
}