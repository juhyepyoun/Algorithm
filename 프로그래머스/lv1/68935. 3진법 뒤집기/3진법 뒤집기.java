class Solution {
    public int solution(int n) {
        int answer = 0;
        String trit = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(trit).reverse();
        answer = Integer.parseInt(sb.toString(), 3);
        return answer;
    }
}