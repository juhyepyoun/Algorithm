class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if(ch == ' ') {
                answer += ch;
            } else if(Character.isUpperCase(ch)) {
                int num = ((int)ch + n - 65) % 26 + 65;
                answer += (char)num;
            } else {
                int num = ((int)ch + n - 97) % 26 + 97;
                answer += (char)num;
            }
        }
        return answer;
    }
}