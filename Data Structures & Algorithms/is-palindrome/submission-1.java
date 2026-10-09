class Solution {
    public boolean isPalindrome(String str) {
        String str2 = str.trim();
        str2 = str2.replaceAll("[^a-zA-Z0-9]", "");
        str2 = str2.toLowerCase();
        int i = str2.length();
        if(i<=1){
            return true;
        }
        
        char a = str2.charAt(0);
        char b = str2.charAt(i-1);
        if(a != b){
            return false;
        }
        return isPalindrome(str2.substring(1, i-1));
        
    }
}
