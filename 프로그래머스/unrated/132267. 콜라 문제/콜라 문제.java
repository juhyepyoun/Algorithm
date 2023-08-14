class Solution {
    public int solution(int a, int b, int n) {
        int r = n % a;
        int q = (n / a) * b;
        int answer = q;
        while(q + r >= a) {
            int temp = q + r;
            q = (temp / a) * b;
            r = temp % a;
            answer += q;
        }
        return answer;
    }
}