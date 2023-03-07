class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] strArray = my_string.split("");
        for(String str : strArray)
            answer += str.repeat(n);
        return answer;
    }
}