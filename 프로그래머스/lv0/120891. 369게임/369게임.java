import java.util.Arrays;
class Solution {
    public int solution(int order) {
        return (int) Arrays.stream(String.valueOf(order).split("")).mapToInt(Integer::parseInt).filter(c -> c == 3 || c == 6 || c == 9).count();
    }
}