class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int i = 0;
        long num = x;
        while(i < n) {
            answer[i++] = num;
            num += x;
        }
        return answer;
    }
}