import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                if(Math.pow(i, 2) == n) {
                    answer.add(i);
                } else {
                    answer.add(i);
                    answer.add(n / i);
                }
            }
        }
        
        Collections.sort(answer);
        return answer.stream().mapToInt(i -> i).toArray();
    }
}