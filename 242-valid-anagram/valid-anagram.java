// class Solution {
//     public boolean isAnagram(String s, String t) {
//       int m =s.length();
//       int n=t.length();
//       int[] count = new int[26];
//       for(int i=0;i<m;i++){
//         count[s.charAt(i) - 'a']++;
//       }
//       for(int j=0;j<n;j++){
//         count[t.charAt(j)- 'a']--;

//       }
//       for(int i=0;i<25;i++){
//         if(count[i]!=0){
//         return false;
//       }
//       }
//       return true;
//     }
// }



class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length()){
        return false;
    }
    HashMap<Character,Integer> map=new HashMap<>();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }
        else{
            map.put(ch,1);
        }
    }
    for(int i=0;i<t.length();i++){
        char ch =t.charAt(i);
        if(!map.containsKey(ch)){
            return false;
        }
        else{
            map.put(ch,map.get(ch)-1);
        }
        if(map.get(ch)==0){
            map.remove(ch);
        }
    }
    return map.isEmpty();
    }
}

