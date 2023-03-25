class Solution {
    public int solution(int num, int k) {
        int answer = String.valueOf(num).indexOf(String.valueOf(k));
        if(answer != -1)
            answer++;
        return answer;
    }
}