class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        if(is_prefix.length() <= my_string.length()) {
            String prefix = my_string.substring(0, is_prefix.length());
            if(prefix.equals(is_prefix))
                answer = 1;
        }
        return answer;
    }
}