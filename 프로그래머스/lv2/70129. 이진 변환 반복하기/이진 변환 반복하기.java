class Solution {
    public int[] solution(String s) {
        // int[] answer = {};
        int[] answer = {0, 0};
        String str = s;
        while(!str.equals("1")) {
            answer[1] += str.length() - str.replace("0", "").length();
            str = Integer.toString(str.replace("0", "").length(), 2);
            answer[0] += 1;
        }
        
        return answer;
    }
}