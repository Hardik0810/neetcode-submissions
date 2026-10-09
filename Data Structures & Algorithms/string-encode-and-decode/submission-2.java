class Solution {

    public String encode(List<String> strs) {
        String str = "";
        for(String str2 : strs){
            str = str + String.valueOf(str2.length()) + "#" + str2;
        };
        return str;

    }
    public List<String> decode(String str) {
    List<String> res = new ArrayList<>();
    int i = 0;
    while (i < str.length()) {
        int j = i;
        while (str.charAt(j) != '#') {
            j++;
        }
        int length = Integer.parseInt(str.substring(i, j));
        i = j + 1;
        res.add(str.substring(i, i + length));
        i += length;
    }
    return res;
}
}
