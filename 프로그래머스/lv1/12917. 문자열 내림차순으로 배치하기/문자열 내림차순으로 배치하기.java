import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        
        String ns = new String(c);
        return new StringBuilder(ns).reverse().toString();
    }
}

// 문자열을 쪼갬
// 쪼갠거 정렬 (asc)
// 뒤집기

