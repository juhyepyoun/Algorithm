class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String new_pat = pat.replace("A", "b").replace("B", "a").toUpperCase();
        if(myString.contains(new_pat))
            answer = 1;
        return answer;
    }
}