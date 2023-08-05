class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[(names.length / 5) + (names.length % 5 > 0 ? 1 : 0)];
        for(int i = 0; i < names.length; i+=5) {
            answer[i/5] = names[i];
        }
        return answer;
    }
}