//longest  common prefix 
public class LongestCommonPrefixPractice {

    // Implement your logic here
    public static String longestCommonPrefix(String[] strs) {

        if (strs.length ==0) {
            return "";
        }
        for(int i=0;i<strs[0].length();i++){
            char ch=strs[0].charAt(i);
            for (int j = 1; j <strs.length; j++) {
                if(i>=strs[j].length()||strs[j].charAt(i)!=ch){
                    return strs[0].substring(0,i);
                }
            }
        }


return strs[0];
        
    }

    public static void main(String[] args) {

        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Output: " + longestCommonPrefix(strs1));

        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Output: " + longestCommonPrefix(strs2));

        String[] strs3 = {"apple", "app", "application"};
        System.out.println("Output: " + longestCommonPrefix(strs3));

        String[] strs4 = {"a"};
        System.out.println("Output: " + longestCommonPrefix(strs4));

        String[] strs5 = {"", "abc"};
        System.out.println("Output: " + longestCommonPrefix(strs5));
    }
}