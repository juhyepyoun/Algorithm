class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double res = num1 / (double) num2;
        res *= 1000;
        answer  = (int)res;
        return answer;
    }
}