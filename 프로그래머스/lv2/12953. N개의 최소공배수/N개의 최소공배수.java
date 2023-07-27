class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int gcd = GCD(arr[0], arr[1]);
        int lcm = (arr[0] * arr[1]) / gcd;
        for(int i = 2; i < arr.length; i++) {
            gcd = GCD(lcm, arr[i]);
            lcm = (lcm * arr[i]) / gcd;
        }
        answer = lcm;
        return answer;
    }
    
    public int GCD(int a, int b) {
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}