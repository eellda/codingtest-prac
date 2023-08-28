class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] ns = s.split(" ");
        
        for (int i = 0; i < ns.length; i++) {
          if (ns[i].equals("Z")) {
            answer -= Integer.parseInt(ns[i - 1]);
          } else {
            answer += Integer.parseInt(ns[i]);
          }
        }
    return answer;
    }
}