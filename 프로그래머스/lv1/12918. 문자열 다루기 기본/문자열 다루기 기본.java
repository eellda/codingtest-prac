class Solution {
    public boolean solution(String s) {
        
        StringBuilder sb = new StringBuilder(s);
        byte[] b = sb.toString().getBytes();
        int length = sb.length();
        
        if (length == 4 || length == 6) {
            for (int i = 0; i < b.length; i++) {
                if (b[i] < '0' || b[i] > '9') {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
}