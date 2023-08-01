class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int len_my = my_string.length();
        int len_suf = is_suffix.length();
        if(len_suf <= len_my) {
            if(my_string.substring(len_my - len_suf, len_my).equals(is_suffix))
                answer = 1;
        }
        return answer;
    }
}