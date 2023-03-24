class Solution {
    public int solution(int n) {
        return n / gcd(n, 6);
    }
    
    public int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}