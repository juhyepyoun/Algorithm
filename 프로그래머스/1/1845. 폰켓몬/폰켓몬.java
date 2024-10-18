import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int N = nums.length / 2;
        
        HashSet<Integer> numSet = new HashSet<>();
        
        for(int num : nums) {
            numSet.add(num);
        }
        
        if(numSet.size() >= N) {
            answer = N;
        } else {
            answer = numSet.size();
        }
        
        return answer;
    }
}