class Solution {
    public boolean checkInclusion(String s1, String s2) {
       char[] s1Arr = s1.toCharArray();
       Arrays.sort(s1Arr);
       String sortedS1 = new String(s1Arr);

       int l = 0;
       int r = s1.length() - 1;
       while(r < s2.length()){
        char[] subS2 = s2.substring(l, r+1).toCharArray();
        Arrays.sort(subS2);
        String str2 = new String(subS2);
        if(sortedS1.equals(str2)){
            return true;
        }
        r++;
        l++;

       }
       return false;
        
    }
}
