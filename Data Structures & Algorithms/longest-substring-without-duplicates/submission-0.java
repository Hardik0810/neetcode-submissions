class Solution {
    public int lengthOfLongestSubstring(String s) {
        int leftIndex = 0;
        int rightIndex = 0;
        int maxLength = 0;
        HashSet<Character> hs = new HashSet<>();
        while(rightIndex < s.length()){
            if(!hs.add(s.charAt(rightIndex))){
                hs.remove(s.charAt(leftIndex));
                leftIndex++;   
            }
            else{
                hs.add(s.charAt(rightIndex));
                maxLength = Math.max(maxLength, rightIndex - leftIndex + 1);
                rightIndex++;
            }
        }
        return maxLength;



    }
}
