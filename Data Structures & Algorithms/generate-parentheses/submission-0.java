class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        helper(n, n, list, "");
        return list;
        
    }

    public void helper(int a , int b, List<String> list, String s ){
        if(a== 0 && b == 0){
            list.add(s);
            return;
        }
        else if(a == 0){
            helper(a, b - 1, list, s + ")");
        }
        else{
            helper(a - 1, b, list, s + "(");
            if(b > a){
                helper(a, b - 1, list, s + ")");
            }
        }
    }
}
