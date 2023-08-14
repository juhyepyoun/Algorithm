class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            int last = -1;
            for(int j = 0; j < i; j++) {
                if(ch == s.charAt(j)) {
                    last = j;
                }
            }
            answer[i] = (last == -1) ? last : i - last;
        }
        return answer;
    }
}