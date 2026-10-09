class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(digits.length() == 0){ 
            return list;
        }
        String[] str = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        helper("", digits, list, str);
        return list;


        
    }

    public void helper(String s , String digits, List<String> list, String[] str){
        if(digits.length() == 0){
            list.add(s);
            return;
        }
        int j = Character.getNumericValue(digits.charAt(0));
        
        for(int i = 0; i < str[j - 2].length(); i++){
            helper(s + str[j - 2].charAt(i), digits.substring(1), list, str);
        }
    }
}
