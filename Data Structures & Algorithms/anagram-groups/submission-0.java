class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<>();
        for(String str : strs){
            int[] count = new int[26];
            for(char c : str.toCharArray()){
                count[c - 'a']++;
            }
            String str2 = Arrays.toString(count);
            map.putIfAbsent(str2, new ArrayList<>());
            map.get(str2).add(str);

        };
        return new ArrayList<>(map.values());
        
    }
}
