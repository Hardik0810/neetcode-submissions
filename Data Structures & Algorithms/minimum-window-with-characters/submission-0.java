

class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";

        // Count needed chars
        Map<Character, Integer> need = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> win = new HashMap<>();
        int needKinds = need.size();  // number of distinct chars we must satisfy
        int haveKinds = 0;            // number of distinct chars currently satisfied

        int l = 0;
        String ans = "";

        for (int r = 0; r < s.length(); r++) {
            char rc = s.charAt(r);
            if (need.containsKey(rc)) {
                win.put(rc, win.getOrDefault(rc, 0) + 1);
                if (win.get(rc).intValue() == need.get(rc).intValue()) {
                    haveKinds++;
                }
            }

            // Shrink as much as possible while the window stays valid
            while (haveKinds == needKinds && l <= r) {
                // Update best answer
                int currLen = r - l + 1;
                if (ans.isEmpty() || currLen < ans.length()) {
                    ans = s.substring(l, r + 1);
                }

                char lc = s.charAt(l);
                if (need.containsKey(lc)) {
                    win.put(lc, win.get(lc) - 1);
                    if (win.get(lc) < need.get(lc)) {
                        haveKinds--;
                    }
                }
                l++;
            }
        }

        return ans;
    }
}