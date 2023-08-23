import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        
        int[] answer = new int[arr.length - 1];
        int min = arr[0];
        int idx = 0;
        
        if (arr.length == 1) {
             return new int[]{-1};
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        
        for (int j = 0; j < arr.length; j++) {
            
            if (min == arr[j]) {
                continue;
            }
            
            answer[idx] = arr[j];
            idx++;
        }

        return answer;
    }
}