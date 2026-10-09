class Solution {
    

    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        List<String> l = new ArrayList<>();
        helper(s, 0, list, l);
        return list;

        
        
    }

    public void helper(String s , int i, List<List<String>> list, List<String> l){
        if(i == s.length()){
            list.add(new ArrayList<>(l));
            return;
        }
        for(int j = i; j < s.length(); j++){
            if(isPalindrome(s, i , j)){
                l.add(s.substring(i, j + 1));
                helper(s, j + 1, list, l);
                l.remove(l.size() - 1);
            }
            
        }
    }

    public boolean isPalindrome(String s, int start, int end){
        while(start <= end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
            
        }
        return true;
    }
}
