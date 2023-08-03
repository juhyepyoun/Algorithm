class Solution {
    public String[] solution(String my_string) {
        String new_string = my_string.replaceAll("\\s+", " ");
        new_string = new_string.trim();
        String[] answer = new_string.split(" ");
        return answer;
    }
}