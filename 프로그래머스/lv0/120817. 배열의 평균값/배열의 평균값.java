class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int total = 0;
        for(int n : numbers)
            total += n;
        answer = total / (double)numbers.length;
        return answer;
    }
}