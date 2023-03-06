class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int gcd = gcd(denom1, denom2);
        int lcm = lcm(denom1, denom2, gcd);
        numer1 *= lcm / denom1;
        numer2 *= lcm / denom2;
        
        int numer = numer1 + numer2;
        
        int gcd2 = gcd(numer, lcm);
        
        int[] answer = {numer / gcd2, lcm / gcd2};
        
        return answer;
    }
    
    public int gcd(int n, int m) {
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        
        return a;
    }
    
    public int lcm(int n, int m, int gcd) {
        return n * m / gcd;
    }
}