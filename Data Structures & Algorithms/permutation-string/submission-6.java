class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        int[] str1 = new int[26];
        int[] str2 = new int[26];

        for(int i = 0; i<s1.length(); i++){
            str1[s1.charAt(i) - 'a']++;
            str2[s2.charAt(i) - 'a']++;
        };
        int matches = 0;
        for(int j = 0; j<26; j++){
            if(str1[j] == str2[j]){
                matches++;
            }
        }

        int l = 0;
        int r = s1.length();
        while(r < s2.length()){
            if(matches == 26){
                return true;
            }
            int index = s2.charAt(r) - 'a';
            str2[index]++;
            if(str2[index] == str1[index]){
                matches++;
            }
            else if (str1[index] + 1 == str2[index]) {
                matches--;
            }

            index = s2.charAt(l) - 'a';
            str2[index]--;
            
            if(str2[index] == str1[index]){
                matches++;;
            }
             else if (str1[index] - 1 == str2[index]) {
                matches--;
            }
            r++;
            l++;
        }
        return matches == 26;
        
    }
}
