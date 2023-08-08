class Solution {
    public String solution(String s) {
        String answer = "";
        int index = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                answer += s.charAt(i);
                index = 0;
            } else {
                answer += (index % 2 == 0) ? Character.toUpperCase(s.charAt(i)) : Character.toLowerCase(s.charAt(i));
                index++;
            }
        }
        return answer;
    }
}