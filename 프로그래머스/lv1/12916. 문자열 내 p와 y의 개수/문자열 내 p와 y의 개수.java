class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pcnt = s.length() - s.replaceAll("(?i)p","").length();
        int ycnt = s.length() - s.replaceAll("(?i)y","").length();
        
        answer = (pcnt != ycnt) ? false : true;

        return answer;
    }
}