class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> inS = new HashMap<>();
        char currentChar;
        for(int i = 0; i < s.length(); i++) {
            currentChar = s.charAt(i);
            if(inS.containsKey(currentChar)) {
                inS.put(currentChar, inS.get(currentChar) + 1);
            } else {
                inS.put(currentChar, 1);
            }
        }
        for(int i = 0; i < t.length(); i++) {
            currentChar = t.charAt(i);
            if(inS.containsKey(currentChar) && inS.get(currentChar) != 0) {
                inS.put(currentChar, inS.get(currentChar) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
