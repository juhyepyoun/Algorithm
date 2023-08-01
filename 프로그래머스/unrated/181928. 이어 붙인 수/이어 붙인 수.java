class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String even = "";
        String odd = "";
        for(int n : num_list) {
            if(n % 2 == 0) {
                even += n;
            } else {
                odd += n;
            }
        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;
    }
}