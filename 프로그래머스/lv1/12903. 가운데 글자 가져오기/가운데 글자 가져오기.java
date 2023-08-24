class Solution {
    public String solution(String s) {
        int idx = s.length() / 2;
        
        return s.length() % 2 != 0 
            ? String.valueOf(new StringBuilder(s).substring(idx, idx + 1)) 
            : String.valueOf(new StringBuilder(s).substring(idx - 1, idx + 1));
    }
}