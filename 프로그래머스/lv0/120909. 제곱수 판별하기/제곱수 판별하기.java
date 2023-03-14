import java.lang.Math;
class Solution {
    public int solution(int n) {
        Double sqrt = Math.sqrt(n);
        if(sqrt == Math.ceil(sqrt)) {
            return 1;
        } else {
            return 2;
        }
    }
}