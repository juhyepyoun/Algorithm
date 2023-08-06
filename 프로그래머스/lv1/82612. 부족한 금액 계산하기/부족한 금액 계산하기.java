class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long total = (long)price * ((long)count * ((long)count + 1) / 2);
        if(total > money) {
            answer = total - money;
        }
        return answer;
    }
}