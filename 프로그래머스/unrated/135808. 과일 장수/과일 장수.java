import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int box = score.length / m;
        for(int i = 1; i <= box; i++) {
            answer += score[score.length - m * i] * m;
        }
        return answer;
    }
}